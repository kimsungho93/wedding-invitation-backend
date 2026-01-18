package com.ksh.weddinginvitation.guestbook.service;

import com.ksh.weddinginvitation.guestbook.dto.GuestbookDto;
import com.ksh.weddinginvitation.guestbook.repository.GuestbookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GuestbookService {
    private final GuestbookRepository guestbookRepository;

    @Transactional(readOnly = true)
    public List<GuestbookDto> getAllGuestbooks() {
        return guestbookRepository.findAllByOrderByCreatedAtDesc()
                .stream()
                .map(GuestbookDto::from)
                .toList();
    }

    @Transactional
    public void saveGuestbook(GuestbookDto request) {
        guestbookRepository.save(request.toEntity());
    }
}

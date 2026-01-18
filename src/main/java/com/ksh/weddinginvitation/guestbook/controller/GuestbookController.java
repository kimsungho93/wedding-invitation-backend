package com.ksh.weddinginvitation.guestbook.controller;

import com.ksh.weddinginvitation.guestbook.dto.GuestbookDto;
import com.ksh.weddinginvitation.guestbook.service.GuestbookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/guestbooks")
public class GuestbookController {
    private final GuestbookService guestbookService;

    @GetMapping
    public ResponseEntity<List<GuestbookDto>> getAllGuestbooks() {
        return ResponseEntity.ok(guestbookService.getAllGuestbooks());
    }

    @PostMapping
    public ResponseEntity<Void> saveGuestbook(@RequestBody GuestbookDto request) {
        guestbookService.saveGuestbook(request);
        return ResponseEntity.ok().build();
    }
}

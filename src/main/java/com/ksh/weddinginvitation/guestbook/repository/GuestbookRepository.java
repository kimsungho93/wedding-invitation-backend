package com.ksh.weddinginvitation.guestbook.repository;

import com.ksh.weddinginvitation.guestbook.entity.Guestbook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestbookRepository extends JpaRepository<Guestbook, Long> {
    List<Guestbook> findAllByOrderByCreatedAtDesc();
}

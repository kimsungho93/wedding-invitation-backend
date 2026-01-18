package com.ksh.weddinginvitation.guestbook.entity;

import com.ksh.weddinginvitation.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "guestbook")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Guestbook extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guestbook_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "content", length = 400)
    private String content;
}

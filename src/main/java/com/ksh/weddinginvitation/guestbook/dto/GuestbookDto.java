package com.ksh.weddinginvitation.guestbook.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ksh.weddinginvitation.guestbook.entity.Guestbook;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class GuestbookDto {
    private Long id;
    private String name;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    public static GuestbookDto from(Guestbook entity) {
        return GuestbookDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .content(entity.getContent())
                .createdAt(entity.getCreatedAt())
                .build();
    }

    public Guestbook toEntity() {
        return Guestbook.builder()
                .name(name)
                .content(content)
                .build();
    }
}

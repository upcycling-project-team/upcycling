package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class ReplyDto {
    private Long replyNumber;
    private Long administratorNumber;
    private Long userNumber;
    private String replyContent;
    private String replySysdate;
}

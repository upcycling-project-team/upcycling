package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class BoradDto {
    private Long boardNumber;
    private Long userNumber;
    private Long replyNumber;
    private Long administratorNumber;
    private String newsTitle;
    private String newsContent;
    private String newsSysdate;
}

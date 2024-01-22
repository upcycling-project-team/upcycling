package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class ShopReviewDto {
    private Long reviewNumber;
    private Long userNumber;
    private Long productNumber;
    private Long administratorNumber;
    private String reviewTitle;
    private String reviewContent;
    private String reviewSysdate;
    private Long reviewRate;
}

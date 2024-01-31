package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class SavedMoneyDto {
    private Long savedMoneyNumber;
    private String savedMoneyContent;
    private Long savedMoneyAmount;
    private String savedMoneyDate;
    private Long userNumber;
}

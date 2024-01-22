package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class FaqDto {
    private Long faqNumber;
    private Long administratorNumber;
    private String faqQuestion;
    private String faqAnswer;
}

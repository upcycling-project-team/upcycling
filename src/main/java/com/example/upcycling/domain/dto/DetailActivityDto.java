package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class DetailActivityDto {
    private Long detailActivityNumber;
    private Long administratorNumber;
    private String detailActivityType;
    private Long detailActivityHit;
    private String detailActivityDate;
    private String detailActivityTitle;
    private String detailActivityContent;
    private String detailActivityWriter;
}

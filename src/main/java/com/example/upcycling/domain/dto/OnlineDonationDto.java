package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class OnlineDonationDto {
    private Long onlineDonationNumber;
    private Long keylingNumber;
    private Long onlineDonationName;
    private String onlineDonationTel;
    private String onlineDonationAddr;
    private String onlineDonationAddrDetail;
}

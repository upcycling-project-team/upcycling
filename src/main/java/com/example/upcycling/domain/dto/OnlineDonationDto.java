package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class OnlineDonationDto {
    private Long onlineDonationNumber;
    private Long keyRingNumber;
    private String onlineDonationName;
    private String onlineDonationTel;
    private String onlineDonationAddr;
    private String onlineDonationAddrDetail;
    private String userNumber;
    private Long onlineMaterialLeather;
    private Long onlineMaterialDenim;
    private Long onlineMaterialCotton;

}

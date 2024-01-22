package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class UserAddressDto {
    private Long addressNumber;
    private Long userNumber;
    private String addressName;
    private String addressZipcode;
    private String addressAddr;
    private String addressAddrDetail;
    private String addressTel;
    private String addressReq;
    private String addressDefault;
}

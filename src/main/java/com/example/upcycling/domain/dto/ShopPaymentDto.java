package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class ShopPaymentDto {
    private Long productNumber;
    private String productName;
    private Long productPrice;
    private Long productImgNumber;
    private String productImgName;
    private String productImgUploadPath;
    private String productImgUuid;

}

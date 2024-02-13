package com.example.upcycling.domain.vo;

import lombok.Data;

@Data
public class MainProductVo {
    private Long productNumber;
    private String productName;
    private Integer productPrice;
    private Integer productSale;
    private Long productImgNumber;
    private String productImgName;
    private String productImgUuid;
    private String productImgUploadPath;
}

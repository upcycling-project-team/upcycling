package com.example.upcycling.domain.vo;

import lombok.Data;

@Data
public class ProductVo {
    private Long productNumber;
    private Long shopCategoryNumber;
    private Long administratorNumber;
    private String productName;
    private String productContent;
    private Long productPrice;
    private Long productSale;
    private String productSysdate;

    private Long productSalePrice;
    private Long productImgNumber;
    String productImgName;
    String productImgUploadPath;
    String productImgUuid;
}

package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long productNumber;
    private Long shopCategoryNumber;
    private Long administratorNumber;
    private String productName;
    private String detailContent;
    private Long detailPrice;
    private Long detailSale;
    private String detailSysdate;
}

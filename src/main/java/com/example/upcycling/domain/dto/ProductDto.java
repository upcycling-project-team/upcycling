package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long productNumber;
    private Long shopCategoryNumber;
    private Long administratorNumber;
    private String productName;
    private String productContent;
    private Long productPrice;
    private Long productSale;
    private String productSysdate;
    private Long clothesMaterialNumber;
}

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

    private Long productSalePrice;

    //편의를 위해 이렇게 하자고 의견이 나왔다.

    private Long clothesMaterialNumber;
}

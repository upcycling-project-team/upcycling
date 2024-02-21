package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class OrderProductDto {
    private Long orderProductNumber;
    private Integer orderProductPrice;
    private Integer orderProductCnt;
    private Long orderNumber;
    private Long productNumber;

//    추가
    private Long clothesMaterialNumber;
}

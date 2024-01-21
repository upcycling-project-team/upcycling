package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class OrderProductDto {
    private Long orderDetailNumber;
    private Long productNumber;
    private Long orderNumber;
    private Long administratorNumber;
    private Long orderDetailPrice;
    private Long orderDetailCnt;
}

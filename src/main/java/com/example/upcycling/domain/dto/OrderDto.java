package com.example.upcycling.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OrderDto {
    private Long orderNumber;
    private Long userNumber;
    private Long clothesMaterialNumber;
    private Long keyringNumber;
    private Integer orderTotal;
    private String orderDate;
    private String orderCard;
    private String orderStatus;
    private String orderReason;
    private String orderName;
    private String orderZipcode;
    private String orderAddr;
    private String orderAddrDetail;
    private String orderTel;
    private String orderReq;
}

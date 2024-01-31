package com.example.upcycling.domain.vo;

import lombok.Data;

@Data
public class UserOrderVo {
    private Long orderNumber;
    private Long userNumber;
    private Long productNumber;
    private Long orderProductCnt;
    private Long orderTotal;
    private String orderDate;
    private String orderAddr;
    private String orderAddrDetail;


}

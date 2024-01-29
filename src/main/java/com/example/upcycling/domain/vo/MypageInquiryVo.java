package com.example.upcycling.domain.vo;

import lombok.Data;

@Data
public class MypageInquiryVo {

    private Long orderNumber;
    private Long orderTotal;
    private String orderDate;
    private String orderStatus;
    private Long productNumber;
    private String productName;
    private Long productImgNumber;
    private String productImgName;
    private String productImgUploadPath;
    private String productImgUuid;
    private Long userNumber;

}

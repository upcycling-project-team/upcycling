package com.example.upcycling.domain.vo;

import lombok.Data;

@Data
public class MypageInquiryDetailsVo {
    private Long orderNumber;
    private Long orderTotal;
    private String orderDate;
    private String orderStatus;
    private String orderReq;
    private Long orderProductPrice;
    private String orderTel;
    private Long productNumber;
    private String productName;
    private Long productImgNumber;
    private String productImgName;
    private String productImgUploadPath;
    private String productImgUuid;
    private Long userNumber;
    private Long shopCategoryNumber;
    private String shopCategoryName;
    private String userEmail;
    private String userPhoneNumber;
    private String userAddress;
    private String userAddressDetail;
}

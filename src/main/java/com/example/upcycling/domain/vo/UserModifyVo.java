package com.example.upcycling.domain.vo;

import lombok.Data;

@Data
public class UserModifyVo {
    private Long userNumber;
    private String userPassword;
    private String userName;
    private String userEmail;
    private String userBirth;
    private String userPhoneNumber;
    private String userId;
//    private String userProfile;
    private String userProfileName;
    private String userProfileUploadPath;
    private String userProfileUuid;
    private Long userPoint;
    private String userAddress;
    private String userAddressDetail;
}

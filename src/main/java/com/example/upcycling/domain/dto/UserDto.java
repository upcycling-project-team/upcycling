package com.example.upcycling.domain.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class UserDto {

    private Long userNumber;

    private String userPassword;
    private String userName;
    private String userEmail;
    private String userBirth;
    private String userPhoneNumber;
    private String userId;
    private String userProfileName;
    private String userProfileUploadPath;
    private String userProfileUuid;
    private Long userPoint;
    private String userAddress;
    private String userAddressDetail;
    private String userBirthYear;
    private String userBirthMonth;
    private String userBirthDay;

}

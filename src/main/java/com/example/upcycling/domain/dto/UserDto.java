package com.example.upcycling.domain.dto;

import lombok.Data;

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
}

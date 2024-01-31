package com.example.upcycling.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;
@Component
@Data

public class UserDto {

    private Long userNumber;

    private String userPassword;
    private String userName;
    private String userEmail;
    private String userBirth;
    private String userPhoneNumber;
    private String userId;
    private String userProfile;
    private Long userPoint;
    private String userAddress;
    private String userAddressDetail;
    private String userBirthYear;
    private String userBirthMonth;
    private String userBirthDay;

}

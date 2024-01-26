package com.example.upcycling.service;

import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.mapper.UserMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceTest {

        @Autowired
        UserService userService;



    @Test
    void register() {
        UserDto userDto = new UserDto();
        userDto.setUserName("몽이용1");
        userDto.setUserPassword("333");
        userDto.setUserNumber(18L);
        userDto.setUserBirth("2024-11-01");
        userDto.setUserId("ccf1");
        userDto.setUserEmail("kkf129@naver.com");
        userDto.setUserPhoneNumber("0100241254");
        userService.register(userDto);

    }

    @Test
    void findUserNumber(){
        UserDto userDto = new UserDto();
        Long userNumber = userService.findUserNumber(userDto);
        System.out.println("userNumber = " + userNumber);
    }


}
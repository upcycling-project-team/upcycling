package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.UserDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    @Autowired
    UserMapper userMapper;
    UserDto userDto;

    @BeforeEach
    void setUp() {
        userDto = new UserDto();
        userDto.setUserNumber(45L);
        userDto.setUserPassword("1237");
        userDto.setUserName("옹옹옹11");
        userDto.setUserEmail("kkk12098@naver.com");
        userDto.setUserId("aaa14");
        userDto.setUserBirth("2024-01-13");
        userDto.setUserPhoneNumber("0102201251");

        userMapper.insert(userDto);
    }


    @Test
    void selectUserNumber() {
        Long aLong = userMapper.selectUserNumber(userDto);
        System.out.println("aLong = " + aLong);
    }



}
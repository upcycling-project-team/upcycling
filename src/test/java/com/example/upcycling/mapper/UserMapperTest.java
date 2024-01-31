package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.UserDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class UserMapperTest {
    @Autowired
    UserMapper userMapper;


    @Test
    void insertAndSelect() {
        UserDto userDto = new UserDto();

        userDto.setUserPassword("12645");
        userDto.setUserName("진홍이");
        userDto.setUserEmail("gg21233@naver.com");
        userDto.setUserId("clceo1");
        userDto.setUserBirthYear("2023");
        userDto.setUserBirthMonth("04");
        userDto.setUserBirthDay("11");
        userDto.setUserPhoneNumber("0102861277");
        userDto.setUserAddress("은평구");
        userDto.setUserAddressDetail("3동");
        userMapper.insert(userDto);

        System.out.println("userDto = " + userDto);

        Long aLong = userMapper.selectUserNumber(userDto).get();
//        Long aLong1 = userMapper.selectUserNumber(userDto.getUserNumber()).get();

        System.out.println("aLong = " + aLong);

        assertThat(aLong).isEqualTo(userDto.getUserNumber());
        /*assertEquals(userDto.getUserNumber(), aLong);*/


    }
}
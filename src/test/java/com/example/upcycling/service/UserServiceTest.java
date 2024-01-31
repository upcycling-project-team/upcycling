package com.example.upcycling.service;

import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.mapper.UserMapper;
import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.service.UserService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

class UserServiceTest {
    @Mock
    UserMapper userMapper;

    @InjectMocks
    UserService userService;
    UserDto userDto;


    @BeforeEach
    void setUp() {
        userDto = new UserDto();
        userDto.setUserPassword("5467");
        userDto.setUserName("은은은");
        userDto.setUserEmail("ffv4@naver.com");
        userDto.setUserId("ddd34");
        userDto.setUserBirthYear("2021");
        userDto.setUserBirthMonth("02");
        userDto.setUserBirthDay("13");
        userDto.setUserPhoneNumber("0102867279");
        userDto.setUserAddress("종로구");
        userDto.setUserAddressDetail("3동");

    }


    @Test
    void register() {

        // given
        doNothing().when(userMapper).insert(any());
        // when
        userService.register(userDto);
        // then
        verify(userMapper, times(1)).insert(any());
        System.out.println("userMapper" + userMapper);


    }


    @Test
     void findUserNumber() {

        doReturn(Optional.empty()).when(userMapper).selectUserNumber(any());
        assertThatThrownBy(() -> userService.findUserNumber(userDto))
                .hasMessageContaining("정보 없음");
   }





}

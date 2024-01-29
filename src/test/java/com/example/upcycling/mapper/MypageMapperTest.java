package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.SavedMoneyDto;
import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.domain.vo.UserModifyVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MypageMapperTest {

    @Autowired
    MypageMapper mypageMapper;



    @Test
    void selectOrderinquiry() {
        mypageMapper.selectOrderinquiry(1L);
    }

    @Test
    void selectMypageUserinquiry(){
        mypageMapper.selectMypageUserinquiry(1L).get();
        System.out.println("mypageMapper = " + mypageMapper);
    }

    @Test
    void updateMemberModify(){
        UserModifyVo userModifyVo = new UserModifyVo();
        userModifyVo.setUserPassword("");
        userModifyVo.setUserEmail("bbb@naver.com");
        userModifyVo.setUserName("아무개");
        userModifyVo.setUserPhoneNumber("01012345678");
        userModifyVo.setUserAddress("의정부");
        userModifyVo.setUserAddressDetail("ddd");
        userModifyVo.setUserBirth("20240131");
        userModifyVo.setUserNumber(1L);

        mypageMapper.updateMemberModify(userModifyVo);
    }

    @Test
    void selectUser(){
        UserDto userDto = mypageMapper.selectUser(1L).get();
        System.out.println("userDto = " + userDto);
    }

    @Test
    void selectOrderDetails (){
        mypageMapper.selectOrderDetails(1L);
        System.out.println("mypageMapper = " + mypageMapper);

    }

    @Test
    void selectListSavedMoney(){
        List<SavedMoneyDto> savedMoneyList = mypageMapper.selectListSavedMoney(1L);
        System.out.println("savedMoneyList = " + savedMoneyList);

    }

}
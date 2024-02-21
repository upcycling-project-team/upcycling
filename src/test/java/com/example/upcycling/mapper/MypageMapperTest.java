package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.SavedMoneyDto;
import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.domain.vo.MypageInquiryVo;
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



//    @Test
//    void selectOrderinquiry() {
//
//        List<MypageInquiryVo> mypageInquiryVos = mypageMapper.selectOrderinquiry(24L);
//        System.out.println("mypageInquiryVos = " + mypageInquiryVos);
//    }

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
        userModifyVo.setUserProfileName("test.jpg");
        userModifyVo.setUserProfileUploadPath("2024/01/23");
        userModifyVo.setUserProfileUuid("test");
        userModifyVo.setUserNumber(24L);

        mypageMapper.updateMemberModify(userModifyVo);
    }

    @Test
    void selectUser(){
        UserDto userDto = mypageMapper.selectUser(1L).get();
        System.out.println("userDto = " + userDto);
    }

    @Test
    void selectOrderDetails (){
        mypageMapper.selectOrderDetails(149L);
        System.out.println("mypageMapper = " + mypageMapper);

    }

    @Test
    void selectListSavedMoney(){
        List<SavedMoneyDto> savedMoneyList = mypageMapper.selectListSavedMoney(1L);
        System.out.println("savedMoneyList = " + savedMoneyList);

    }

    @Test
    void deleteUser(){
        mypageMapper.deleteUser(5L);
    }

}
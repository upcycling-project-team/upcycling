package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.SavedMoneyDto;
import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.MypageInquiryDetailsVo;
import com.example.upcycling.domain.vo.MypageInquiryVo;
import com.example.upcycling.domain.vo.UserModifyVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MypageMapper {
    //    주문상품 리스트 조회
    List<MypageInquiryVo> selectOrderinquiry(@Param("userNumber") Long userNumber, @Param("criteria") Criteria criteria);

    //  오더넘버 토탈
    int selectTotal(Long userNumber);

    //    회원 이름, 포인트 조회
    Optional<UserDto> selectMypageUserinquiry(Long userNumber);

    //    회원정보 수정
    void updateMemberModify(UserModifyVo userModifyVo);

    //    회원 아이디/비번 조회
    Optional<UserDto> selectUser(Long userNumber);

    //    주문 내역 조회(단건)
    MypageInquiryDetailsVo selectOrderDetails(Long orderNumber);

    //    회원 적립금 내역 리스트 조회
    List<SavedMoneyDto> selectListSavedMoney(Long userNumber);

    // 회원탈퇴
    void deleteUser(Long userNumber);

}
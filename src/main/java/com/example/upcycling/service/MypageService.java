package com.example.upcycling.service;

import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.domain.vo.MypageInquiryDetailsVo;
import com.example.upcycling.domain.vo.MypageInquiryVo;
import com.example.upcycling.domain.vo.UserModifyVo;
import com.example.upcycling.mapper.MypageMapper;
import com.example.upcycling.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MypageService {
    private final MypageMapper mypageMapper;

    //    주문상품 조회
    public List<MypageInquiryVo> findOrderinquiry(Long userNumber){
        return mypageMapper.selectOrderinquiry(userNumber);
    }

    //    회원 이름, 포인트 조회
    public UserDto findMypageUserinquiry(Long userNumber){
        return mypageMapper.selectMypageUserinquiry(userNumber)
                .orElseThrow(() -> new IllegalArgumentException("조회안됨"));

    }

    //    회원정보 수정
    public void modifyMemberModify(UserModifyVo userModifyVo){
        mypageMapper.updateMemberModify(userModifyVo);
    }

    //    회원 아이디/비번 조회
    public UserDto findUser(Long userNumber){
        return mypageMapper.selectUser(userNumber)
                .orElseThrow(() -> new IllegalArgumentException("유효하지 않은 회원"));
    }

    //    주문 내역 조회(단건)
    public MypageInquiryDetailsVo findOrderDetails(Long orderNumber){
        return mypageMapper.selectOrderDetails(orderNumber);
    }
}

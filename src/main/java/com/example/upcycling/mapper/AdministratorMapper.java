package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.*;
import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.UserOrderVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AdministratorMapper {
//  접근제한
    Optional<Long> selectAdminNumber(AdministratorDto administratorDto);
//----------------------------
//   상품 조회
    List<ProductDto> selectProductInfo(Criteria criteria);

//   상품 카운트 조회
    int selectTotal();
//----------------------------
//   상품 리뷰 조회
    List<ShopReviewDto> selectProductReview(Criteria criteria);

//   상품 리뷰 카운트 조회
    int selectReviewTotal();
//-----------------------------
//   회원 정보 조회
    List<UserDto> selectUserInfo(Criteria criteria);

//   회원 정보 카운트 조회
    int selectUserTotal();
//------------------------------
//  회원 주문 조회
    List<UserOrderVo> selectUserOrder(Criteria criteria);
//  회원 주문 정보 카운트
    int selectUserOrderTotal();
//    --------------------------
//    faq 정보 조회
    List<FaqDto> selectFaqInfo(Criteria criteria);
//    faq 정보 카운트 조회
    int selectFaqTotal();
//    faq 삽입
    void insertFaq(FaqDto faqDto);


//-------------------------
//    point 정보 조회
    List<UserDto> selectPointInfo(Criteria criteria);
//     point 정보 카운트
    int selectPointTotal();

//    -----------------------------------------------
//    삭제
//    product-info 삭제
    void deleteProductInfo(Long productNumber);
//      product-review 삭제
    void deleteProductReview(Long reviewNumber);
//      user-info 삭제
    void deleteUserInfo(Long userNumber);



}

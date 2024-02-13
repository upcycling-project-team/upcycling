package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface ShopPaymentMapper {

//    상품(단건) 조회
    ShopPaymentDto selectOrderProduct(Long productNumber);

//    주문자 정보 조회
    Optional<UserDto> selectUser(Long userNumber);

//    주문 정보입력
    void insertOrder(OrderDto orderDto);

//    옷감 단건조회
    ClothesMaterialDto selectCmn(Long clothesMaterialNumber);

//    주문 상품 등록
    void insertOrderP(OrderProductDto orderProductDto);
}

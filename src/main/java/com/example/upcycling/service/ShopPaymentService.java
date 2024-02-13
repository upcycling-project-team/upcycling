package com.example.upcycling.service;

import com.example.upcycling.domain.dto.*;
import com.example.upcycling.mapper.ShopPaymentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ShopPaymentService {
    private final ShopPaymentMapper shopPaymentMapper;

    //    주문상품 단건 조회
    public ShopPaymentDto findOrderProduct(Long productNumber){
        return shopPaymentMapper.selectOrderProduct(productNumber);
    }

    //    주문자 정보 조회
    public UserDto findUser(Long userNumber){
        Optional<UserDto> userNumberDto = shopPaymentMapper.selectUser(userNumber);
        return userNumberDto.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원"));
    }

    //    주문 정보입력
    public void registerOrder(OrderDto orderDto){
        shopPaymentMapper.insertOrder(orderDto);
    }

    //    옷감 단건조회
    public ClothesMaterialDto findCmn(Long clothesMaterialNumber){
        return shopPaymentMapper.selectCmn(clothesMaterialNumber);
    }

    // 주문
    public void orderProcess(OrderDto orderDto, Long productNumber){
        shopPaymentMapper.insertOrder(orderDto);

        Long orderNumber = orderDto.getOrderNumber();
        Integer orderTotalPrice = orderDto.getOrderTotal();

        OrderProductDto orderProductDto = new OrderProductDto();
        orderProductDto.setOrderNumber(orderNumber);
        orderProductDto.setOrderProductCnt(1);
        orderProductDto.setOrderProductPrice(orderTotalPrice);
        orderProductDto.setProductNumber(productNumber);

        shopPaymentMapper.insertOrderP(orderProductDto);
    }

}

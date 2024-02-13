package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.ClothesMaterialDto;
import com.example.upcycling.domain.dto.OrderDto;
import com.example.upcycling.domain.dto.ShopPaymentDto;
import com.example.upcycling.domain.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShopPaymentMapperTest {
    @Autowired
    ShopPaymentMapper shopPaymentMapper;

    @Test
    void selectOrderProduct(){
        ShopPaymentDto shopPaymentDto = shopPaymentMapper.selectOrderProduct(1L);
        System.out.println("shopPaymentDto = " + shopPaymentDto);
    }

    @Test
    void selectUser(){
        UserDto userDto = shopPaymentMapper.selectUser(24L).get();
        System.out.println("userDto = " + userDto);
    }

    @Test
    void insertOrder(){
        OrderDto orderDto = new OrderDto();
        orderDto.setOrderTotal(10000);
        orderDto.setOrderCard("국민");
        orderDto.setOrderStatus("결제완료");
        orderDto.setOrderName("여진구");
        orderDto.setOrderZipcode("111111");
        orderDto.setOrderAddr("서울턱별시");
        orderDto.setOrderAddrDetail("노원구");
        orderDto.setOrderTel("02-0000");
        orderDto.setOrderReq("대면");
        orderDto.setUserNumber(24L);
        orderDto.setClothesMaterialNumber(1L);



        shopPaymentMapper.insertOrder(orderDto);
    }

    @Test
    void selectCmn(){
        ClothesMaterialDto clothesMaterialDto = shopPaymentMapper.selectCmn(1L);
        System.out.println("clothesMaterialDto = " + clothesMaterialDto);

    }
}
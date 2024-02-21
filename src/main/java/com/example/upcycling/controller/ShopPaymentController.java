package com.example.upcycling.controller;

import com.example.upcycling.domain.dto.*;
import com.example.upcycling.service.ShopPaymentService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/shop-payment")
public class ShopPaymentController {

    private final ShopPaymentService shopPaymentService;

    @GetMapping("/shop_payment")
    public String shopPayment(HttpSession session, Model model, Long productNumber){
        Long userNumber = (Long) session.getAttribute("userNumber");
//      Long userNumber = 22L;
//      Long ProductNumber = 1L;


        ShopPaymentDto shopPaymentDto = shopPaymentService.findOrderProduct(productNumber);
        UserDto user = shopPaymentService.findUser(userNumber);


        model.addAttribute("payment", shopPaymentDto);
        model.addAttribute("user", user);



        return "shop-payment/shop_payment";
    }

    @PostMapping("/shop_payment")
    public String payment(HttpSession session, OrderDto orderDto ){
        Long userNumber = (Long) session.getAttribute("userNumber");
//        Long userNumber = 24L;

        shopPaymentService.registerOrder(orderDto);

        return ("mypage/orderinquiry");
    }
}

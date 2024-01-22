package com.example.upcycling.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mypage")
public class MypageController {

    @GetMapping("/exchange")
    public String exchange(){
        return "mypage/exchange";
    }

    @GetMapping("/exchange-details")
    public String exchangedetails(){
        return "mypage/exchangedetails";
    }

    @GetMapping("/inquiry")
    public String inquiry(){
        return "mypage/inquiry";
    }

    @GetMapping("/orderdetails")
    public String orderdetails(){
        return "mypage/orderdetails";
    }

    @GetMapping("savedmoney")
    public String savedmoney(){
        return "mypage/savedmoney";
    }

    @GetMapping("/writinginquiries")
    public String writinginquiries(){
        return "mypage/writinginquiries";
    }

    @GetMapping("/orderinquiry")
    public String orderinquiry(){
        return "mypage/orderinquiry";
    }

}

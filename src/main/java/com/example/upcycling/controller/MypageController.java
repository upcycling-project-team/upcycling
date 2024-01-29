package com.example.upcycling.controller;

import com.example.upcycling.domain.dto.SavedMoneyDto;
import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.domain.vo.MypageInquiryDetailsVo;
import com.example.upcycling.domain.vo.MypageInquiryVo;
import com.example.upcycling.service.MypageService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mypage")
public class MypageController {
    @Autowired
    MypageService mypageService;

    @GetMapping("/exchange")
    public String exchange(HttpSession session, Model model){
        //Long userNumber = (Long) session.getAttribute("userNumber");
        Long userNumber = 1L;

        UserDto userDto = mypageService.findMypageUserinquiry(userNumber);

        model.addAttribute("user", userDto);

        return "mypage/exchange";
    }

    @GetMapping("/exchangedetails")
    public String exchangedetails(){
        return "mypage/exchangedetails";
    }

    @GetMapping("/inquiry")
    public String inquiry(){
        return "mypage/inquiry";
    }


    @GetMapping("/savedmoney")
    public String savedmoney(HttpSession session, Model model){
        //Long userNumber = (Long) session.getAttribute("userNumber");
        Long userNumber = 1L;

        List<SavedMoneyDto> listSavedMoney = mypageService.findListSavedMoney(userNumber);
        UserDto userDto = mypageService.findMypageUserinquiry(userNumber);

        model.addAttribute("savedMoney", listSavedMoney);
        model.addAttribute("user", userDto);
        return "mypage/savedmoney";
    }

    @GetMapping("/writinginquiries")
    public String writinginquiries(){
        return "mypage/writinginquiries";
    }

    @GetMapping("/orderinquiry")
    public String orderinquiry(HttpSession session, Model model){
        //Long userNumber = (Long) session.getAttribute("userNumber");
        Long userNumber = 1L;

        List<MypageInquiryVo> orderinquiryList = mypageService.findOrderinquiry(userNumber);
        UserDto userDto = mypageService.findMypageUserinquiry(userNumber);


        model.addAttribute("inquiryList", orderinquiryList);
        model.addAttribute("user", userDto);

        return "mypage/orderinquiry";
    }

    @GetMapping("/orderdetails")
    public String orderdetails(HttpSession session, Model model, Long orderNumber){
        //Long userNumber = (Long) session.getAttribute("userNumber");
        Long userNumber = 1L;

        UserDto userDto = mypageService.findMypageUserinquiry(userNumber);
        MypageInquiryDetailsVo orderDetails = mypageService.findOrderDetails(orderNumber);
        model.addAttribute("user", userDto);
        model.addAttribute("order", orderDetails);


        return "mypage/orderdetails";
    }


}

package com.example.upcycling.controller;

import com.example.upcycling.domain.dto.SavedMoneyDto;
import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.MypageInquiryDetailsVo;
import com.example.upcycling.domain.vo.MypageInquiryVo;
import com.example.upcycling.domain.vo.PageVo;
import com.example.upcycling.service.MypageService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mypage")
public class MypageController {

    private final MypageService mypageService;

    @GetMapping("/exchange")
    public String exchange(HttpSession session, Model model){
        Long userNumber = (Long) session.getAttribute("userNumber");
//        Long userNumber = 339L;

        UserDto userDto = mypageService.findMypageUserinquiry(userNumber);

        model.addAttribute("user", userDto);

        return "mypage/exchange";
    }

    @GetMapping("/exchangedetails")
    public String exchangedetails(HttpSession session, Model model){

        Long userNumber = (Long) session.getAttribute("userNumber");
//        Long userNumber = 24L;

        UserDto userDto = mypageService.findMypageUserinquiry(userNumber);

        model.addAttribute("user", userDto);
        return "mypage/exchangedetails";
    }

    @GetMapping("/inquiry")
    public String inquiry(HttpSession session, Model model){

        Long userNumber = (Long) session.getAttribute("userNumber");
//        Long userNumber = 24L;


        List<SavedMoneyDto> listSavedMoney = mypageService.findListSavedMoney(userNumber);
        UserDto userDto = mypageService.findMypageUserinquiry(userNumber);

        model.addAttribute("savedMoney", listSavedMoney);
        model.addAttribute("user", userDto);
        return "mypage/inquiry";
    }


    @GetMapping("/savedmoney")
    public String savedmoney(HttpSession session, Model model){

        Long userNumber = (Long) session.getAttribute("userNumber");
//        Long userNumber = 24L;


        List<SavedMoneyDto> listSavedMoney = mypageService.findListSavedMoney(userNumber);
        UserDto userDto = mypageService.findMypageUserinquiry(userNumber);

        model.addAttribute("savedMoney", listSavedMoney);
        model.addAttribute("user", userDto);
        return "mypage/savedmoney";
    }

//
    @GetMapping("/writinginquiries")
    public String writinginquiries(HttpSession session, Model model){

        Long userNumber = (Long) session.getAttribute("userNumber");
//        Long userNumber = 24L;


        UserDto userDto = mypageService.findMypageUserinquiry(userNumber);

        model.addAttribute("user", userDto);

        return "mypage/writinginquiries";
    }

//    주문내역 리스트
    @GetMapping("/orderinquiry")
    public String orderinquiry(HttpSession session, Model model, Criteria criteria){

        Long userNumber = (Long) session.getAttribute("userNumber");
//        Long userNumber = 24L;


        List<MypageInquiryVo> orderinquiryList = mypageService.findOrderinquiry(userNumber, criteria);
        UserDto userDto = mypageService.findMypageUserinquiry(userNumber);


        model.addAttribute("inquiryList", orderinquiryList);
        model.addAttribute("user", userDto);

        //  상품 리뷰 리스트 5개씩 노출
        int Total = mypageService.findTotal(userNumber);
        PageVo pageVo = new PageVo(Total, criteria);

        model.addAttribute("List",pageVo);

        return "mypage/orderinquiry";
    }

//    주문 상세내역
    @GetMapping("/orderdetails")
    public String orderdetails(HttpSession session, Model model, Long orderNumber){

        Long userNumber = (Long) session.getAttribute("userNumber");
//        Long userNumber = 24L;


        UserDto userDto = mypageService.findMypageUserinquiry(userNumber);
        MypageInquiryDetailsVo orderDetails = mypageService.findOrderDetails(orderNumber);
        model.addAttribute("user", userDto);
        model.addAttribute("order", orderDetails);


        return "mypage/orderdetails";
    }

    // 회원탈퇴
    @GetMapping("/users/delete")
    public  RedirectView getUserDelete(HttpSession session){

        Long userNumber = (Long) session.getAttribute("userNumber");
            mypageService.removeUser(userNumber);

            return new RedirectView("/user/login");
    }


}

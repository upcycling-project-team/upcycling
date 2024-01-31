package com.example.upcycling.controller;

import com.example.upcycling.domain.dto.AdministratorDto;
import com.example.upcycling.domain.dto.ProductDto;
import com.example.upcycling.domain.dto.ShopReviewDto;
import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.PageVo;
import com.example.upcycling.service.AdministratorService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdministratorController {
    private final AdministratorService administratorService;

    /*로그인*/
    @GetMapping("/login")
    public String login(){
        return "admin/login";
    }

    @PostMapping("/login")
    public String login(AdministratorDto administratorDto, HttpSession session, Model model){
        System.out.println("administratorDto = " + administratorDto);

        Long adminNumber = null;

        try {
            adminNumber = administratorService.findAdminLogin(administratorDto);
        } catch (IllegalStateException e) {
//            e.printStackTrace();
            model.addAttribute("errorMessage" , "로그인 정보를 확인하세요");
            return "admin/login";
        }
        System.out.println("adminNumber = " + adminNumber);

        session.setAttribute("adminNumber", adminNumber);
        return "admin/dash-board";
    }

    /*로그아웃*/
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();

        return "admin/login";
    }

    /*대시보드*/
    @GetMapping("/dash-board")
    public String dashBoard(HttpSession session){
        Long adminNumber = (Long) session.getAttribute("adminNumber");

        if(adminNumber == null){
            return "admin/login";
        }

        return "admin/dash-board";
    }

    /*상품*/
    @GetMapping("/product-info")
    public String productInfo(HttpSession session, Criteria criteria, Model model){
        //        접근 제한
        Long adminNumber = (Long)session.getAttribute("adminNumber");

        if(adminNumber == null){
            return "admin/login";
        }
//        리스트 5개씩 노출
        List<ProductDto> productInfo = administratorService.findProductInfo(criteria);
        // System.out.println("productInfo = " + productInfo);
        model.addAttribute("productInfo", productInfo);

        // 5개씩 페이징 처리
        int total = administratorService.findTotal();
        PageVo pageVo = new PageVo(total, criteria);

        model.addAttribute("pageInfo", pageVo);

        return "admin/product-info";
    }

//    @GetMapping("/product-delivery-fee")
//    public String productDeliveryFee(HttpSession session){
//        Long adminNumber = (Long)session.getAttribute("adminNumber");
//
//        if(adminNumber == null){
//            return "admin/login";
//        }
//
//        return "admin/product-delivery-fee";
//    }
    @GetMapping("/product-review")
    public String productReview(HttpSession session, Criteria criteria, Model model){
        //        접근 제한
        Long adminNumber = (Long)session.getAttribute("adminNumber");

        if(adminNumber == null){
            return "admin/login";
        }
//  상품리뷰 리스트 조회
        List<ShopReviewDto> productReview = administratorService.findProductReview(criteria);
        System.out.println("productReview = " + productReview);
        model.addAttribute("productReview",productReview);

//  상품 리뷰 리스트 5개씩 노출
        int reviewTotal = administratorService.findReviewTotal();
        PageVo pageVo = new PageVo(reviewTotal, criteria);

        model.addAttribute("pageReview",pageVo);

        return "admin/product-review";



    }

    /*회원*/
    @GetMapping("/user-info")
    public String userInfo(HttpSession session, Criteria criteria, Model model){
        //        접근 제한
        Long adminNumber = (Long)session.getAttribute("adminNumber");

        if(adminNumber == null){
            return "admin/login";
        }
//        회원 정보 리스트 조회
        List<UserDto> userInfo = administratorService.findUserInfo(criteria);
        System.out.println("userInfo = " + userInfo);
        model.addAttribute("userInfo",userInfo);



        return "admin/user-info";
    }

    @GetMapping("/user-order")
    public String userOrder(HttpSession session){
//     접근제한
        Long adminNumber = (Long)session.getAttribute("adminNumber");

        if(adminNumber == null){
            return "admin/login";
        }
//  회원 정보 리스트 조회


        return "admin/user-order";
    }

    @GetMapping("/user-delivery")
    public String userDelivery(HttpSession session){
        //        접근 제한
        Long adminNumber = (Long)session.getAttribute("adminNumber");

        if(adminNumber == null){
            return "admin/login";
        }


        return "admin/user-delivery";
    }

    /*포인트*/
    @GetMapping("point-page")
    public String pointPage(HttpSession session){
        //        접근 제한
        Long adminNumber = (Long)session.getAttribute("adminNumber");

        if(adminNumber == null){
            return "admin/login";
        }


        return "admin/point-page";
    }


}

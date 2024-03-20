package com.example.upcycling.controller;

import com.example.upcycling.domain.dto.ProductDto;
import com.example.upcycling.domain.dto.ReviewImgDto;
import com.example.upcycling.domain.dto.ShopReviewDto;
import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.PageVo;
import com.example.upcycling.service.ProductService;
import com.example.upcycling.service.ShopReviewService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/shop")
public class ShopReviewController {
    private final ShopReviewService shopReviewService;

    @GetMapping("/review")
    public String shop02(Long productNumber, Criteria criteria, Model model){
        List<ShopReviewDto> shopReviewList = shopReviewService.findReviewList2(productNumber, criteria);
        Double star = shopReviewService.findStarAvg(productNumber);
        Long product = shopReviewService.findProductNumber(productNumber);

        int total = shopReviewService.findTotal(productNumber);

        PageVo pageVo = new PageVo(total, criteria);


        model.addAttribute("reviewList",shopReviewList);
        model.addAttribute("star",star);
        model.addAttribute("product",product);
        model.addAttribute("pageVo", pageVo);

        return "shop/shop02_review";
    }

    @GetMapping("/write")
    public String shop03(Long productNumber,HttpSession session,Model model)
    {
//        로그인한 회원만 구매평을 작성할 수 있다.
        Long userNumber = (Long) session.getAttribute("userNumber");
//        Long userNumber =22L;
        if (userNumber == null) {
            return "user/login";
        }

//      구매한 사람만 구매평을 작성할 수 있다.
        Long product = shopReviewService.findProductNumber(productNumber);
        Long count = shopReviewService.findCount(userNumber,productNumber);
        if (count == 0){
            return "shop/shop04";
        }

        model.addAttribute("product",product);
        model.addAttribute("userNumber",userNumber);
        return "shop/shop03";
    }

    @PostMapping("/write")
    public RedirectView shop04(ShopReviewDto shopReviewDto,
                               @RequestParam("reviewFile") MultipartFile multipartFile) {

        System.out.println("shopReviewDto = " + shopReviewDto + ", multipartFile = " + multipartFile);

        try {
            shopReviewService.register(shopReviewDto, multipartFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new RedirectView("/shop/main");
    }


    @GetMapping("no-count")
    public String shop05(){
        return "shop/shop04";
    }
}

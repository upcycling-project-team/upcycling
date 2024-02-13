package com.example.upcycling.controller;

import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.MainProductVo;
import com.example.upcycling.domain.vo.MainReviewVo;
import com.example.upcycling.domain.vo.PageVo;
import com.example.upcycling.service.ProductService;
import com.example.upcycling.service.ShopReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final ProductService productService;
    private final ShopReviewService shopReviewService;

    @GetMapping("/")
    public String enterMain(Model model, Criteria criteria){
        criteria.setAmount(10);
        List<MainProductVo> productList = productService.findProductInfoImg();
        List<MainReviewVo> reviewList = shopReviewService.findReviewList(criteria);
        int total = shopReviewService.findReviewTotal();
        PageVo pageVo = new PageVo(total, criteria);

        model.addAttribute("productList", productList);
        model.addAttribute("reviewList", reviewList);
        model.addAttribute("pageInfo", pageVo);

        return "main/main";
    }

}

package com.example.upcycling.controller;

import com.example.upcycling.domain.dto.ProductDto;
import com.example.upcycling.domain.dto.ShopCategoryDto;
import com.example.upcycling.domain.dto.ShopReviewDto;
import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.PageVo;
import com.example.upcycling.domain.vo.ProductVo;
import com.example.upcycling.service.ProductService;
import com.example.upcycling.service.ShopCategoryService;
import com.example.upcycling.service.ShopReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/shop")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/main")
    public String shop01(Criteria criteria, Model model){
        List<ProductVo> productList = productService.findAll(criteria);

        int total = productService.findTotal();
        PageVo pageVo = new PageVo(total,criteria);

        model.addAttribute("productList",productList);
        model.addAttribute("pageVo", pageVo);
        return "shop/shop01";
    }

    @GetMapping("/detail")
    public String shop02(Long productNumber, Model model){
        ProductVo product = productService.findAll2(productNumber);
        ProductDto clothesDenim = productService.findClothes();
        ProductDto clothesLeather = productService.findClothes2();
        ProductDto clothesCotton = productService.findClothes3();

        model.addAttribute("product",product);
        model.addAttribute("clothesDenim",clothesDenim);
        model.addAttribute("clothesLeather",clothesLeather);
        model.addAttribute("clothesCotton",clothesCotton);

        return "shop/shop02";
    }

}

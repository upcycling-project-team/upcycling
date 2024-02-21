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

        ProductVo categoryBag = productService.findCategoryBag();
        ProductVo categoryWallet = productService.findCategoryWallet();
        ProductVo categoryBook = productService.findCategoryBook();
        ProductVo categoryWineCover = productService.findCategoryWineCover();

        model.addAttribute("productList",productList);
        model.addAttribute("pageVo", pageVo);

        model.addAttribute("categoryBag",categoryBag);
        model.addAttribute("categoryWallet",categoryWallet);
        model.addAttribute("categoryBook",categoryBook);
        model.addAttribute("categoryWineCover",categoryWineCover);
        return "shop/shop01";
    }

    @GetMapping("/bag")
    public String shop011(Long shopCategoryNumber,Criteria criteria, Model model){
        List<ProductVo> productList2 = productService.findCategoryList(shopCategoryNumber,criteria);

        int total = productService.findTotal();
        PageVo pageVo = new PageVo(total,criteria);

        ProductVo categoryBag = productService.findCategoryBag();
        ProductVo categoryWallet = productService.findCategoryWallet();
        ProductVo categoryBook = productService.findCategoryBook();
        ProductVo categoryWineCover = productService.findCategoryWineCover();

        model.addAttribute("productList",productList2);
        model.addAttribute("pageVo", pageVo);

        model.addAttribute("categoryBag",categoryBag);
        model.addAttribute("categoryWallet",categoryWallet);
        model.addAttribute("categoryBook",categoryBook);
        model.addAttribute("categoryWineCover",categoryWineCover);
        return "shop/shop01_bag";
    }

    @GetMapping("/wallet")
    public String shop012(Long shopCategoryNumber,Criteria criteria, Model model){
        List<ProductVo> productList2 = productService.findCategoryList(shopCategoryNumber,criteria);

        int total = productService.findTotal();
        PageVo pageVo = new PageVo(total,criteria);

        ProductVo categoryBag = productService.findCategoryBag();
        ProductVo categoryWallet = productService.findCategoryWallet();
        ProductVo categoryBook = productService.findCategoryBook();
        ProductVo categoryWineCover = productService.findCategoryWineCover();

        model.addAttribute("productList",productList2);
        model.addAttribute("pageVo", pageVo);

        model.addAttribute("categoryBag",categoryBag);
        model.addAttribute("categoryWallet",categoryWallet);
        model.addAttribute("categoryBook",categoryBook);
        model.addAttribute("categoryWineCover",categoryWineCover);
        return "shop/shop01_wallet";
    }

    @GetMapping("/book")
    public String shop013(Long shopCategoryNumber,Criteria criteria, Model model){
        List<ProductVo> productList2 = productService.findCategoryList(shopCategoryNumber,criteria);

        int total = productService.findTotal();
        PageVo pageVo = new PageVo(total,criteria);

        ProductVo categoryBag = productService.findCategoryBag();
        ProductVo categoryWallet = productService.findCategoryWallet();
        ProductVo categoryBook = productService.findCategoryBook();
        ProductVo categoryWineCover = productService.findCategoryWineCover();

        model.addAttribute("productList",productList2);
        model.addAttribute("pageVo", pageVo);

        model.addAttribute("categoryBag",categoryBag);
        model.addAttribute("categoryWallet",categoryWallet);
        model.addAttribute("categoryBook",categoryBook);
        model.addAttribute("categoryWineCover",categoryWineCover);
        return "shop/shop01_book";
    }

    @GetMapping("/winecover")
    public String shop014(Long shopCategoryNumber,Criteria criteria, Model model){
        List<ProductVo> productList2 = productService.findCategoryList(shopCategoryNumber,criteria);

        int total = productService.findTotal();
        PageVo pageVo = new PageVo(total,criteria);

        ProductVo categoryBag = productService.findCategoryBag();
        ProductVo categoryWallet = productService.findCategoryWallet();
        ProductVo categoryBook = productService.findCategoryBook();
        ProductVo categoryWineCover = productService.findCategoryWineCover();

        model.addAttribute("productList",productList2);
        model.addAttribute("pageVo", pageVo);

        model.addAttribute("categoryBag",categoryBag);
        model.addAttribute("categoryWallet",categoryWallet);
        model.addAttribute("categoryBook",categoryBook);
        model.addAttribute("categoryWineCover",categoryWineCover);
        return "shop/shop01_cover";
    }

    @GetMapping("/detail")
    public String shop02(Long productNumber,ProductVo shopCategoryNumber, Model model){
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

package com.example.upcycling.service;


import com.example.upcycling.domain.dto.ShopCategoryDto;
import com.example.upcycling.domain.vo.MainProductVo;

import com.example.upcycling.domain.dto.ProductDto;
import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.ProductVo;

import com.example.upcycling.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductMapper productMapper;
    public List<MainProductVo> findProductInfoImg(){
        return productMapper.selectProductInfoImg();
    }

    //    LeeKiYong
    public List<ProductVo> findAll(Criteria criteria){
        List<ProductVo> productList = productMapper.selectAll(criteria);
        return productList;
    }

    public int findTotal(){
        return productMapper.selectTotal();
    }

    public ProductVo findAll2(Long productNumber){
        return productMapper.selectAll2(productNumber)
                .orElse(null);
    }

    public ProductDto findClothes(){
        return productMapper.selectClothes().orElse(null);
    }
    public ProductDto findClothes2(){
        return productMapper.selectClothes2().orElse(null);
    }
    public ProductDto findClothes3(){
        return productMapper.selectClothes3().orElse(null);
    }

    public List<ProductVo> findCategoryList(Long shopCategoryNumber, Criteria criteria){
        List<ProductVo> productList2 = productMapper.selectCategoryList(shopCategoryNumber,criteria);
        return productList2;
    }

    public ProductVo findCategoryBag(){return productMapper.selectCategoryBag().orElse(null);}
    public ProductVo findCategoryWallet(){return productMapper.selectCategoryWallet().orElse(null);}
    public ProductVo findCategoryBook(){return productMapper.selectCategoryBook().orElse(null);}
    public ProductVo findCategoryWineCover(){return productMapper.selectCategoryWineCover().orElse(null);}

}

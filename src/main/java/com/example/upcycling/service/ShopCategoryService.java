package com.example.upcycling.service;

import com.example.upcycling.domain.dto.ShopCategoryDto;
import com.example.upcycling.mapper.ShopCategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShopCategoryService {
    private final ShopCategoryMapper shopCategoryMapper;

    public ShopCategoryDto findShopCategoryName(Long shopCategoryNumber){
        return shopCategoryMapper.selectShopCategoryName(shopCategoryNumber)
                .orElse(null);
    }
}

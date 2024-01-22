package com.example.upcycling.service;

import com.example.upcycling.mapper.ShopCategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShopCategoryService {
    private final ShopCategoryMapper shopCategoryMapper;
}

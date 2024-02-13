package com.example.upcycling.service;

import com.example.upcycling.domain.vo.MainProductVo;
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
}

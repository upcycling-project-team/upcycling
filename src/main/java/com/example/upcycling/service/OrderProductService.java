package com.example.upcycling.service;

import com.example.upcycling.mapper.OrderMapper;
import com.example.upcycling.mapper.OrderProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderProductService {
    private final OrderProductMapper orderProductMapper;
}

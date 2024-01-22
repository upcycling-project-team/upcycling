package com.example.upcycling.controller;

import com.example.upcycling.service.OrderProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class OrderProductController {
    private final OrderProductService orderProductService;
}

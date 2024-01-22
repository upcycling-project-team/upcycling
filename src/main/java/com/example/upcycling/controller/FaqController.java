package com.example.upcycling.controller;

import com.example.upcycling.service.FaqService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class FaqController {
    private final FaqService faqService;
}

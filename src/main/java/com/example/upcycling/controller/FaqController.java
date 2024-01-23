package com.example.upcycling.controller;

import com.example.upcycling.service.FaqService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/faq")
public class FaqController {
    private final FaqService faqService;

    @GetMapping("/faq01")
    public String faq01(){
        return "faq/faq01";
    }

    @GetMapping("/faq02")
    public String faq02(){
        return "faq/faq02";
    }

    @GetMapping("/faq03")
    public String faq03(){
        return "faq/faq03";
    }

}

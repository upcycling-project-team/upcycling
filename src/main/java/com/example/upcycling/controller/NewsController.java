package com.example.upcycling.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/news")
public class NewsController {

    @GetMapping("/detail")
    public String newsDetail(){
        return "news/detail";
    }
    @GetMapping("/list")
    public String news(){
        return "news/list";
    }
}

package com.example.upcycling.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/community")
public class CommunityController {

    @GetMapping("/list")
    public String community(){
        return "community/list";
    }
    @GetMapping("/detail")
    public String detail() {
        return "community/detail";
    }
    @GetMapping("/write")
    public String writer(){
        return "community/write";
    }
}

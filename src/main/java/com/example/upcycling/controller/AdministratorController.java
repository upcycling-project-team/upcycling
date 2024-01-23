package com.example.upcycling.controller;

import com.example.upcycling.service.AdministratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdministratorController {
    private final AdministratorService administratorService;

    @GetMapping("/login")
    public String login(){
        return "admin/login";
    }

    @GetMapping("/dash-board")
    public String dashBoard(){
        return "admin/dash-board";
    }

    @GetMapping("/register")
    public String register(){
        return "admin/register";
    }

    @GetMapping("/user-page")
    public String userPage(){
        return "admin/user-page";
    }

    @GetMapping("point-page")
    public String pointPage(){
        return "admin/point-page";
    }
}

package com.example.upcycling.controller;

import com.example.upcycling.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/login")
    public String login(){
        return "user/login";
    }

    @GetMapping("/clause")
    public String clause(){
        return "user/clause";
    }

    @GetMapping("/membership")
    public String membership(){
        return "user/membership";
    }

    @GetMapping("/about")
    public String about(){
        return "user/about";
    }
}

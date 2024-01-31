package com.example.upcycling.controller;

import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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


    /* 회원가입 */
    @GetMapping("/membership")
    public String membership(){
        return "user/membership";
    }

    /* 회원가입 */
    @PostMapping("/membership")
    public String membership(UserDto userDto){
        System.out.println("userDto = " + userDto);
      userService.register(userDto);
         return "user/login";
    }



    @GetMapping("/about")
    public String about(){
        return "user/about";
    }
}




















package com.example.upcycling.controller;

import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;


    /* 회원가입 */
    @GetMapping("/membership")
    public String membership() {
        return "user/membership";
    }

    /* 회원가입 */
    @PostMapping("/membership")
    public RedirectView membership(UserDto userDto, @RequestParam("userProFile")
            MultipartFile files) {
        /*   System.out.println("userDto = " + userDto);*/
        try {
            userService.registerFile2(userDto, files);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new RedirectView("/user/login");
    }



    /* 로그인 */
    @GetMapping("/login")
    public String login() {
        return "user/login";
    }

//    /* 로그인 */
//    @PostMapping("/login")
//    public RedirectView login(UserDto userDto, HttpSession session) {
//
//        Long userNumber = null;
//        try {
//            userNumber = userService.findUserNumber(userDto);
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//            return new RedirectView("/user/login") ;
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//
//        session.setAttribute("userNumber", userNumber);
//        return new RedirectView("/");
//    }

    /* 로그인 */
    @PostMapping("/login")
    public RedirectView login(UserDto userDto, HttpSession session, Model model, RedirectAttributes attributes) {

        Long userNumber = null;
        try {
            userNumber = userService.findUserNumber(userDto);
        } catch (IllegalStateException e) {
//            e.printStackTrace();
            attributes.addFlashAttribute("errorMessage" , "로그인 정보를 확인하세요");
//            model.addAttribute("errorMessage" , "로그인 정보를 확인하세요");
            return new RedirectView("/user/login");
//            return new RedirectView("/user/login") ;
        } catch (Exception e){
            e.printStackTrace();
        }

        session.setAttribute("userNumber", userNumber);
//        return new RedirectView("/");
        return new RedirectView("/");
    }


    /* 전체 동의 */
    @GetMapping("/clause")
    public String clause() {
        return "user/clause";
    }


    /* 회사 소개 */
    @GetMapping("/about")
    public String about() {
        return "user/about";
    }

//    로그아웃
    @GetMapping("/logout")
    public RedirectView logout(HttpSession session){
//        invalidate()는 세션을 초기화시켜서 저장된 값을 모두 날린다.
        session.invalidate();
        return new RedirectView("/user/login");
    }

}



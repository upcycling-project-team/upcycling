package com.example.upcycling.api;

import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.domain.vo.UserModifyVo;
import com.example.upcycling.service.MypageService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MyPageRestController {
    private final MypageService mypageService;

    @GetMapping("/users/update-info")
    public UserDto getUserInfo(HttpSession session){
//        Long userNumber = (Long) session.getAttribute("userNumber");
        Long userNumber = 1L;

        UserDto user = mypageService.findUser(userNumber);
        return user;
    }

    @PatchMapping("/users/update-info")
    public void getUserInfo(HttpSession session, @RequestBody UserModifyVo userModifyVo){
//        Long userNumber = (Long) session.getAttribute("userNumber");
        Long userNumber = 1L;

        userModifyVo.setUserNumber(userNumber);
        System.out.println("result = " + userModifyVo);

        mypageService.modifyMemberModify(userModifyVo);
    }
}

package com.example.upcycling.api;

import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.domain.vo.UserModifyVo;
import com.example.upcycling.service.MypageService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class MyPageRestController {
    private final MypageService mypageService;

    //    application.properties에 저장해둔 file.dir 프로퍼티 값을 가져온다.
    @Value("${file.dir}")
    private String fileDir;

    @GetMapping("/users/update-info")
    public UserDto getUserInfo(HttpSession session){
        Long userNumber = (Long) session.getAttribute("userNumber");
//        Long userNumber = 24L;

        UserDto user = mypageService.findUser(userNumber);
        return user;
    }

    @PatchMapping("/users/update-info")
    public void getUserInfo(HttpSession session,
                            UserModifyVo userModifyVo,
                            @RequestParam(value = "profile", required = false) MultipartFile multipartFile){
        Long userNumber = (Long) session.getAttribute("userNumber");
//        Long userNumber = 24L;

        userModifyVo.setUserNumber(userNumber);

        try {
            mypageService.modifyInfoWithProfile(userModifyVo, multipartFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

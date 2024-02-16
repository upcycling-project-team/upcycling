package com.example.upcycling.controller;

import com.example.upcycling.domain.vo.LikeVo;
import com.example.upcycling.service.LikeService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequiredArgsConstructor
public class LikeRestController {
    private final LikeService likeService;


    @PostMapping("/likes")
    public int insert(@RequestBody LikeVo likeVo, HttpSession session){
//     Long userNumber = (Long)session.getAttribute("userNumber");
        Long userNumber = 26L;

        likeVo.setUserNumber(userNumber);
        System.out.println("likeVo = " + likeVo);

        return likeService.processLike(likeVo);
    }

//    @DeleteMapping("/likes")
//    public void delete(Long communityNumber,Long userNumber){
//        likeService.deleteLike(userNumber,communityNumber);
//    }
//
//    @GetMapping("/likes")
//    public int select(Model model,Long communityNumber,Long userNumber ,HttpSession session){
//        int likeSelect = likeService.selectLike(userNumber,communityNumber);
////        userNumber=(Long)session.getAttribute("userNumber");
//       model.addAttribute("likeSelect",likeSelect);
//       model.addAttribute("likeVo",likeSelect);
//        return likeSelect;
//
//    }
}

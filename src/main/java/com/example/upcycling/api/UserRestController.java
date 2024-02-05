package com.example.upcycling.api;

import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.domain.vo.LikeVo;
import com.example.upcycling.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserRestController {

    private final UserService userService;

    @GetMapping("/membership")
    public ResponseEntity<String> findUserId(String userId) {
        System.out.println("userId = " + userId);
        try {
            Optional<String> result = userService.findUserFindId(userId);

            if (result.isPresent()) {
                return ResponseEntity.ok("Duplicate"); // 아이디 중복
            } else {
                return ResponseEntity.ok("Available"); // 아이디 사용 가능
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
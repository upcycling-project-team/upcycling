package com.example.upcycling.service;

import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    //  로그인  회원 정보 삽입
    public void register(UserDto userDto){
        userMapper.insert(userDto);
    }

    //   로그인 시 회원 번호 조회
    public Long findUserNumber(UserDto userDto){
        return userMapper.selectUserNumber(userDto);
    }

}

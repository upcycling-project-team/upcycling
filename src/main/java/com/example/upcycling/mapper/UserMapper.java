package com.example.upcycling.mapper;



import com.example.upcycling.domain.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

@Mapper
public interface UserMapper {





    // 회원가입
    void insert(UserDto userDto);
    // 로그인
    Long selectUserNumber(UserDto userDto);


}

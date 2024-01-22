package com.example.upcycling.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

// 매퍼 인터페이스로 등록을 하기위한 어노테이션
@Mapper
public interface TimeMapper {
//    Mapper.xml의 쿼리 id와 일치하는 메소드 이름을 사용하면 알아서 매핑된다.
    String selectTime();

    @Select("SELECT SYSDATE FROM DUAL")
    String selectTime2();
}









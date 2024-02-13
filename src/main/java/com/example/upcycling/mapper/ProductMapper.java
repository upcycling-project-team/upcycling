package com.example.upcycling.mapper;

import com.example.upcycling.domain.vo.MainProductVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    public List<MainProductVo> selectProductInfoImg();
}

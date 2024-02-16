package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.ShopCategoryDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ShopCategoryMapper {
    Optional<ShopCategoryDto> selectShopCategoryName(Long shopCategoryNumber);
}

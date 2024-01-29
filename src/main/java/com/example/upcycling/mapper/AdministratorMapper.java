package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.AdministratorDto;
import com.example.upcycling.domain.dto.ProductDto;
import com.example.upcycling.domain.vo.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AdministratorMapper {

    Optional<Long> selectAdminNumber(AdministratorDto administratorDto);

    List<ProductDto> selectProductInfo(Criteria criteria);

}

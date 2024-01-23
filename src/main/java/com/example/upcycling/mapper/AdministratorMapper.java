package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.AdministratorDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdministratorMapper {

    Long selectAdminNumber(AdministratorDto administratorDto);



}

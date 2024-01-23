package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.AdministratorDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdministratorMapperTest {

    @Autowired
    AdministratorMapper administratorMapper;

    @Test
    void selectAdminNumber(){
        AdministratorDto administratorDto = new AdministratorDto();

        administratorDto.setAdministratorId("admin1");
        administratorDto.setAdministratorPassword("1234");

        Long number = administratorMapper.selectAdminNumber(administratorDto);
        System.out.println("number = " + number);

    }
}
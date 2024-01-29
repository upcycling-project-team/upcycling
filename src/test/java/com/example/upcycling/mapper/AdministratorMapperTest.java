package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.AdministratorDto;
import com.example.upcycling.domain.dto.ProductDto;
import com.example.upcycling.domain.vo.Criteria;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

        Long number = administratorMapper.selectAdminNumber(administratorDto).get();
        System.out.println("number = " + number);

    }

    @Test
    void selectProductInfo(){
        Criteria criteria = new Criteria();
        criteria.setPage(1);
        criteria.setAmount(5);
        List<ProductDto> productDtos = administratorMapper.selectProductInfo(criteria);
        System.out.println("productDtos = " + productDtos);
    }
}
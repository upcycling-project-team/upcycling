package com.example.upcycling.service;

import com.example.upcycling.domain.dto.AdministratorDto;
import com.example.upcycling.domain.dto.ProductDto;
import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.mapper.AdministratorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdministratorService {
    private final AdministratorMapper administratorMapper;

    public Long findAdminLogin(AdministratorDto administratorDto){
        Long number = administratorMapper.selectAdminNumber(administratorDto)
                .orElseThrow(() -> new IllegalStateException("유효하지 않은 회원정보"));
        return number;
    }

    public List<ProductDto> findProductInfo(Criteria criteria){
        return administratorMapper.selectProductInfo(criteria);
    }
}

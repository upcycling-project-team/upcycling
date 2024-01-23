package com.example.upcycling.service;

import com.example.upcycling.domain.dto.AdministratorDto;
import com.example.upcycling.mapper.AdministratorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdministratorService {
    private final AdministratorMapper administratorMapper;

    public Long findAdminLogin(AdministratorDto administratorDto){
        Long number = administratorMapper.selectAdminNumber(administratorDto);
        return number;

    }
}

package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.OnlineDonationDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OnlineDonationMapperTest {

    @Autowired
    OnlineDonationMapper onlineDonationMapper;
    OnlineDonationDto onlineDonationDto;

    @BeforeEach
    void setUp() {
        onlineDonationDto = new OnlineDonationDto();
        onlineDonationDto.setOnlineDonationNumber(4L);
        onlineDonationDto.setUserNumber(1L);
        onlineDonationDto.setOnlineMaterialLeather(0);
        onlineDonationDto.setOnlineMaterialDenim(1);
        onlineDonationDto.setOnlineMaterialCotton(1);
        onlineDonationDto.setOnlineDonationAgree("Y");
        onlineDonationDto.setOnlineKeyringAgree("Y");

    }


    @Test
    void insert() {
        onlineDonationMapper.insert(onlineDonationDto);

    }
}
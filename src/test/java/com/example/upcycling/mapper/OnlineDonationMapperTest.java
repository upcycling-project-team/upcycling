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
        onlineDonationDto.setOnlineDonationNumber(1L);
        onlineDonationDto.setOnlineDonationName("기부하기");
        onlineDonationDto.setOnlineDonationTel("01026228606");
        onlineDonationDto.setOnlineDonationAddr("노원구");
        onlineDonationDto.setOnlineDonationAddrDetail("코리아아카데미5층");
        onlineDonationDto.setOnlineMaterialLeather(1L);
        onlineDonationDto.setOnlineMaterialDenim(0L);
        onlineDonationDto.setOnlineMaterialCotton(1L);
        onlineDonationDto.setKeyRingNumber(1L);
        onlineDonationDto.setUserNumber("1");

    }


    @Test
    void insert() {
//        onlineDonationMapper.insert(onlineDonationDto);

    }
}
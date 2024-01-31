package com.example.upcycling.service;

import com.example.upcycling.domain.dto.OnlineDonationDto;
import com.example.upcycling.mapper.OnlineDonationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OnlineDonationService {
    private final OnlineDonationMapper onlineDonationMapper;

    public void register(List<String> materials, String idAgree, String keyringAgree, Long userNumber){

        OnlineDonationDto donationDto = new OnlineDonationDto();
        donationDto.setUserNumber(userNumber);
        donationDto.setOnlineDonationAgree(idAgree);
        donationDto.setOnlineKeyringAgree(keyringAgree);

        for(String material : materials){
            if(material.equals("denim")){
                donationDto.setOnlineMaterialDenim(1);
            }else if(material.equals("cotton")){
                donationDto.setOnlineMaterialCotton(1);
            }else if(material.equals("leather")){
                donationDto.setOnlineMaterialLeather(1);
            }
        }

        onlineDonationMapper.insert(donationDto);
    }
}





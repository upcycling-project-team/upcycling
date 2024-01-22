package com.example.upcycling.service;

import com.example.upcycling.mapper.OnlineDonationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OnlineDonationService {
    private final OnlineDonationMapper onlineDonationMapper;
}

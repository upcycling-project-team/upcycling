package com.example.upcycling.service;

import com.example.upcycling.mapper.DetailActivityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DetailActivityService {
    private final DetailActivityMapper detailActivityMapper;
}

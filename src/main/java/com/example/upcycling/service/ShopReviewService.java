package com.example.upcycling.service;

import com.example.upcycling.mapper.ShopReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShopReviewService {
    private final ShopReviewMapper shopReviewMapper;
}

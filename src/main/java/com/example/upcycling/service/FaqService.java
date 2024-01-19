package com.example.upcycling.service;

import com.example.upcycling.mapper.FaqMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FaqService {
    private final FaqMapper faqMapper;
}

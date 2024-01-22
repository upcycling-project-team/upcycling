package com.example.upcycling.service;

import com.example.upcycling.mapper.ClothesMaterialMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClothesMaterialService {
    private final ClothesMaterialMapper clothesMaterialMapper;
}

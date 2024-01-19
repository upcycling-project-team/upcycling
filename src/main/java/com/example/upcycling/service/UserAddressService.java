package com.example.upcycling.service;

import com.example.upcycling.mapper.UserAddressMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserAddressService {
    private final UserAddressMapper userAddressMapper;
}

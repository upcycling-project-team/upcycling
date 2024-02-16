package com.example.upcycling.service;

import com.example.upcycling.domain.dto.CommunityDto;
import com.example.upcycling.domain.vo.CommunityVo;
import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.mapper.CommunityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CommunityService {
    private final CommunityMapper communityMapper;

    public List<CommunityVo> findList(Criteria criteria){
        return communityMapper.selectList(criteria);
    }

    public int findTotal(){
        return communityMapper.listTotal();
    }

    public CommunityVo findDetail(Long communityNumber){
        return communityMapper.selectDetail(communityNumber);
    }

    public String findId(Long userNumber){
        Optional<String> opt = communityMapper.selectId(userNumber);

        return opt.orElseThrow( () -> new IllegalStateException("조회 결과 없음!"));
    }

    public void communityWrite(CommunityDto communityDto){
        communityMapper.insert(communityDto);
    }
}

package com.example.upcycling.service;

import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    // 저장해둔 file.dir
    @Value("${file.dir}")
    private String fileDir;

    //  로그인  회원 정보 삽입
    public void register(UserDto userDto) {
        userMapper.insert(userDto);
    }


    //   로그인 시 회원 번호 조회
    public Long findUserNumber(UserDto userDto) {
        return userMapper.selectUserNumber(userDto)
                .orElseThrow(() -> new IllegalStateException("일치하는 회원 정보 없음"));

    }

    // 아이디 중복 조회
    public Optional<String> findUserFindId(String userId) {
        try {
            return userMapper.selectUserFindId(userId);
        } catch (Exception e) {
            throw new RuntimeException("서버 오류가 발생했습니다: " + e.getMessage(), e);
        }
    }


    // 파일 정보 저장
    public void registerFile2(UserDto userDto, MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        UUID uuid = UUID.randomUUID();
        String systemName = uuid.toString() + "_" + originalFilename;

// 상위경로 합침
        File uploadPath = new File(fileDir, getUploadPath());

        if (!uploadPath.exists()) {
            uploadPath.mkdirs();
        }


        //  전체 경로 / 파일이름
        File uploadFile = new File(uploadPath, systemName);

        file.transferTo(uploadFile);

        userDto.setUserProfileUuid(uuid.toString());
        userDto.setUserProfileName(originalFilename);
        userDto.setUserProfileUploadPath(getUploadPath());


        userMapper.insert(userDto);
    }


    // 현재 날짜
    private String getUploadPath() {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String uploadPath = sdf.format(today);
        return uploadPath;
    }


}



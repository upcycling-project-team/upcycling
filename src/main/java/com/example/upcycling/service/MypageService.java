package com.example.upcycling.service;

import com.example.upcycling.domain.dto.SavedMoneyDto;
import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.domain.vo.MypageInquiryDetailsVo;
import com.example.upcycling.domain.vo.MypageInquiryVo;
import com.example.upcycling.domain.vo.UserModifyVo;
import com.example.upcycling.mapper.MypageMapper;
import com.example.upcycling.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MypageService {
    private final MypageMapper mypageMapper;

    @Value("${file.dir}")
    private String fileDir;


    //    주문상품 조회
    public List<MypageInquiryVo> findOrderinquiry(Long userNumber){
        return mypageMapper.selectOrderinquiry(userNumber);
    }

    //    회원 이름, 포인트 조회
    public UserDto findMypageUserinquiry(Long userNumber){
        Optional<UserDto> userDtoNumber = mypageMapper.selectMypageUserinquiry(userNumber);
        return userDtoNumber.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원"));


    }

    //    회원정보 수정
    public void modifyMemberModify(UserModifyVo userModifyVo){
        mypageMapper.updateMemberModify(userModifyVo);
    }

//    회원정보 수정(파일처리)
    public void modifyInfoWithProfile(UserModifyVo userModifyVo, MultipartFile multipartFile) throws IOException {
        if (multipartFile != null) {
            //        사용자가 올린 파일 이름(확장자를 포함)
            String originalFilename = multipartFile.getOriginalFilename();
//        파일이름에 붙여줄 uuid 생성(파일이름에 중복이 나오지 않게 처리)
            UUID uuid = UUID.randomUUID();
//        uuid와 파일이름을 합쳐준다.
            String systemName = uuid.toString() + "_" + originalFilename;

//        상위경로(upload)와 하위경로(2024/01/16)를 합쳐준다.(풀경로를 위해)
            File uploadPath = new File(fileDir, getUploadPath());
//        C:/upload/2024/01/16 만들어짐

            if(!uploadPath.exists() ){
    //            경로가 존재하지 않는다면(폴더가 만들어지지 않았다면)
    //            경로에 필요한 mkdirs(폴더)를 여러개 만들어라
                uploadPath.mkdirs();
            }

//        전체 경로와 파일이름을 연결
            File uploadFile = new File(uploadPath, systemName);
//        C:/upload/2024/01/16/uuid_a.jpg 로 만들어짐

//        파일 저장
            multipartFile.transferTo(uploadFile);

            userModifyVo.setUserProfileUuid(uuid.toString());
            userModifyVo.setUserProfileName(originalFilename);
            userModifyVo.setUserProfileUploadPath(getUploadPath());
        }

        mypageMapper.updateMemberModify(userModifyVo);
    }


    //    회원 아이디/비번 조회
    public UserDto findUser(Long userNumber){
        return mypageMapper.selectUser(userNumber)
                .orElseThrow(() -> new IllegalArgumentException("유효하지 않은 회원"));
    }

    //    주문 내역 조회(단건)
    public MypageInquiryDetailsVo findOrderDetails(Long orderNumber){
        return mypageMapper.selectOrderDetails(orderNumber);
    }

    //    회원 적립금 내역 리스트 조회
    public List<SavedMoneyDto> findListSavedMoney(Long userNumber){
        return mypageMapper.selectListSavedMoney(userNumber);
    }

    // 회원 탈퇴
    public void removeUser(Long userNumber){
        mypageMapper.deleteUser(userNumber);
    }




    private String getUploadPath() {
        //        Date라는 타입으로 today객체 만들고
        Date today = new Date();
//        SimpleDateFormat 타입으로 패턴("yyyy/MM/dd") 지정해주고
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        String uploadPath = sdf.format(today);

        return uploadPath;
    }
}

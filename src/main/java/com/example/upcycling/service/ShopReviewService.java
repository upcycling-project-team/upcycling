package com.example.upcycling.service;

import com.example.upcycling.domain.dto.ProductDto;
import com.example.upcycling.domain.dto.ReviewImgDto;
import com.example.upcycling.domain.dto.ShopReviewDto;
import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.mapper.ShopReviewImgMapper;
import com.example.upcycling.mapper.ShopReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class ShopReviewService {
    private final ShopReviewMapper shopReviewMapper;
    private final ShopReviewImgMapper shopReviewImgMapper;

    //    application.properties에 저장해둔 file.dir 프로퍼티 값을 가져온다.
    @Value("${file.dir}")
    private String fileDir;

    public List<ShopReviewDto> findReviewList(Long productNumber, Criteria criteria){
        List<ShopReviewDto> shopReviewList = shopReviewMapper.selectReviewList(productNumber, criteria);
        return shopReviewList;
    }

    public int findTotal(Long productNumber){
        return shopReviewMapper.selectTotal(productNumber);
    }

    public Double findStarAvg(Long productNumber){
        return shopReviewMapper.selectStarAvg(productNumber)
                .orElse(null);
    }

    public Long findProductNumber(Long productNumber){
        return shopReviewMapper.selectProductNumber(productNumber)
                .orElse(null);
    }

    public Long findCount(Long userNumber, Long productNumber){
        return shopReviewMapper.selectCount(userNumber, productNumber)
                .orElse(null);
    }

    //    게시물 삽입
    public void register(ShopReviewDto shopReviewDto, MultipartFile file) throws IOException{
        shopReviewMapper.insert(shopReviewDto);
        Long reviewNumber = shopReviewDto.getReviewNumber();

//        사용자가 올린 파일 이름(확장자를 포함 함)
        String originalFilename = file.getOriginalFilename();
//        파일이름에 붙여줄 uuid 생성(파일이름 중복이 나오지 않게 처리)
        UUID uuid = UUID.randomUUID();
//        uuid와 파일이름을 합쳐준다.
        String systemName = uuid.toString() + "_" + originalFilename;

//       상위경로(upload)와 하위경로(2024/01/22)를 합쳐준다.
        File uploadPath = new File(fileDir, getUploadPath());
//        C:/upload/2024/01/22

        if (!uploadPath.exists()) {
            // 경로가 존재하지 않는다면(폴더가 만들어지지 않았다면)

//            경로에 필요한 폴더를 생성한다.
            uploadPath.mkdirs();
        }

//        전체 경로와 파일이름을 연결
        File uploadFile = new File(uploadPath, systemName);
//        C:/upload/2024/01/22/uuid_a.jpg

        file.transferTo(uploadFile);

        ReviewImgDto reviewImgDto = new ReviewImgDto();
        reviewImgDto.setReviewImgUuid(uuid.toString());
        reviewImgDto.setReviewImgName(originalFilename);
        reviewImgDto.setReviewImgUploadPath(getUploadPath());
        reviewImgDto.setReviewNumber(reviewNumber);

        shopReviewImgMapper.insert(reviewImgDto);
    }


    //    파일이 저장되는 하위 경로를 현재 날짜로 설정할 것이기 때문에 현재 날짜를 구한다.
    private String getUploadPath() {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        String uploadPath = sdf.format(today);

        return uploadPath;
    }

}

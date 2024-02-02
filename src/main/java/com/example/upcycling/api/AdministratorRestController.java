package com.example.upcycling.api;

import com.example.upcycling.service.AdministratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AdministratorRestController {
    private final AdministratorService administratorService;

    @DeleteMapping("/products/{productNumber}")
    public void deleteProduct(@PathVariable("productNumber")Long productNumber){
        System.out.println("productNumber = " + productNumber);
        administratorService.removeProductInfo(productNumber);
        System.out.println("@@@@@@@@@실행!!!!");
    }

    @PatchMapping("/users/{userNumber}/points")
    public void modifyPoint(@PathVariable("userNumber") Long userNumber){
        System.out.println("userNumber = " + userNumber);

    }

//    @DeleteMapping("/")

}

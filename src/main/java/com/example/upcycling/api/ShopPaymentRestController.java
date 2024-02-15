package com.example.upcycling.api;

import com.example.upcycling.domain.dto.OrderDto;
import com.example.upcycling.domain.dto.ShopPaymentDto;
import com.example.upcycling.service.ShopPaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ShopPaymentRestController {
    private final ShopPaymentService shopPaymentService;

    @PostMapping("/orders/products/{productNumber}")
    public void orderRegister(@RequestBody OrderDto orderDto,
                              @PathVariable("productNumber") Long productNumber,
                              @SessionAttribute(value = "userNumber", required = false) Long userNumber){


        System.out.println("orderDto = " + orderDto + ", productNumber = " + productNumber);
        orderDto.setUserNumber(userNumber);

        shopPaymentService.orderProcess(orderDto, productNumber);


    }
}

package com.example.upcycling.domain.vo;

import lombok.Data;

@Data
public class Criteria {
    private int page;
    private int amount;

    public Criteria() {
        this.page = 1;
        this.amount = 5;
    }
}

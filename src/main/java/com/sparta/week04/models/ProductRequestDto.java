package com.sparta.week04.models;

import lombok.Getter;

@Getter

public class ProductRequestDto {
    // 관심상품을 POST 할 때 필요한 DTO Class
    // title / link / image / lprice
    private String title;
    private String link;
    private String image;
    private int lprice;
}

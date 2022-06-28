package com.sparta.week04.models;

import lombok.Getter;

@Getter

public class ProductMypriceRequestDto {
    // 사용자가 설정한 관심상품의 가격을 PUT 하는 기능을 수행 (DTO Class)
    private int myprice;
}

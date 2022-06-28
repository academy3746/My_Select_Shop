package com.sparta.week04.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
// Generate GET Method automatically!
@NoArgsConstructor
// Generate No_Argument (Parameter) Constructor!
@Entity
// Make Table on DB Server!

public class Product extends TimeStamped {
    // Inherit TimeStamped.java Class
    // title, image, link, lprice, myprice
    // Only Product.java class transfer data to DB Server.

    // id++
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    // Essentially have it's value
    private String title;

    @Column(nullable = false)
    // Essentially have it's value
    private String image;

    @Column(nullable = false)
    // Essentially have it's value
    private String link;

    @Column(nullable = false)
    // Essentially have it's value
    private int lprice;

    @Column(nullable = false)
    // Essentially have it's value
    private int myprice;

    // 관심상품을 POST 할 때 이용하는 Request DTO 내장객체
    public Product(ProductRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.image = requestDto.getImage();
        this.link = requestDto.getLink();
        this.lprice = 0;
        // Default Value for Lower Price
    }

    // 관심상품을 PUT 할 때 이용하는 Request DTO 내장객체
    public void update(ProductMypriceRequestDto requestDto){
        this.myprice = requestDto.getMyprice();
    }

    // 최저가 상품 정보를 시간단위로 PUT 할 때 이용하는 Request DTO 내장객체
    public void updateByItemDto(ItemDto itemDto) {
        this.lprice = itemDto.getLprice();
    }
}

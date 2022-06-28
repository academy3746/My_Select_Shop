package com.sparta.week04.controller;

import com.sparta.week04.models.Product;
import com.sparta.week04.models.ProductMypriceRequestDto;
import com.sparta.week04.models.ProductRepository;
import com.sparta.week04.models.ProductRequestDto;
import com.sparta.week04.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
// final 로 접근을 제한해 준 멤버변수를 자동으로 생성하는 기능
@RestController
// 데이터를 JSON 형식으로 주고 받을 것임을 Java 에게 선언

public class ProductRestController {

    private final ProductRepository productRepository;
    private final ProductService productService;

    // 등록된 전체 상품 목록 조회
    @GetMapping("/api/products")
    public List<Product> getProducts(){
        return productRepository.findAll();
        // SELECT * FROM TABLE;
    }

    // 신규 상품 등록
    @PostMapping("/api/products")
    public Product createProducts(@RequestBody ProductRequestDto requestDto){
        // @RequestBody: JSON 데이터를 requestDto 객체에 저장!
        Product product = new Product(requestDto);
        productRepository.save(product);
        return product;
    }

    // 관심상품 최처가 설정
    @PutMapping("/api/products/{id}")
    public Long updateProduct(@PathVariable Long id, @RequestBody ProductMypriceRequestDto requestDto){
        return productService.update(id, requestDto);
    }
}

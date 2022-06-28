package com.sparta.week04.controller;

import com.sparta.week04.models.ItemDto;
import com.sparta.week04.utils.NaverShopSearch;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
// Generate Constructor for final member
@RestController
// Hey, java! I will do response as JSON!

public class SearchRequestController {
    private final NaverShopSearch naverShopSearch;

    @GetMapping("/api/search")
    public List<ItemDto> getItems(@RequestParam String query){
        // @RequestParam: Request as doGet()
        String resultString = naverShopSearch.search(query);
        return naverShopSearch.fromJSONtoItems(resultString);
    }
}

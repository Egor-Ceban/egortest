package com.egor.rltTwo.controller;

import com.egor.rltTwo.model.Shop;
import com.egor.rltTwo.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shops")
@RequiredArgsConstructor
public class ShopController {
    private final ShopService shopService;
    @PostMapping("/{userId}/{shopName}")
    public Shop createShop(@PathVariable Long userId, @PathVariable String shopName) {
        return shopService.createShop(userId, shopName);
    }

    @GetMapping("/{id}")
    public Shop getShop(@PathVariable Long id){
        return shopService.getShop(id);
    }
}

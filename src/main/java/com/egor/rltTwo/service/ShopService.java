package com.egor.rltTwo.service;

import com.egor.rltTwo.model.Shop;
import com.egor.rltTwo.model.User;
import com.egor.rltTwo.repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class ShopService {
    private final ShopRepository shopRepository;
    private final UserService userService;

    public Shop createShop(Long userId, String shopName) {
        User owner = userService.getUser(userId);
        Shop shop = new Shop();
        shop.setShopName(shopName);
        shop.setOwner(owner);
        return shopRepository.save(shop);
    }
    public Shop getShop(Long id) {
        return shopRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
    public Shop save(Shop shop) {
        return shopRepository.save(shop);
    }
}

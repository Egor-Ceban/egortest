package com.egor.rltTwo.service;

import com.egor.rltTwo.dto.ItemDto;
import com.egor.rltTwo.model.Item;
import com.egor.rltTwo.model.Shop;
import com.egor.rltTwo.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
    private  final ShopService shopService;
    public Item createItem(Long shopId, ItemDto itemDto) {
        Shop shop = shopService.getShop(shopId);
        Item item = new Item();
        item.setName(itemDto.getName());
        item.setPrice(itemDto.getPrice());
        item.setIsAvailable(itemDto.getIsAvailable());
        List<Item> itemList = shop.getItemList();
        if(itemList == null) {
            itemList = new ArrayList<>();
        }
        item = itemRepository.save(item);
        itemList.add(item);
        shopService.save(shop);
        return item;
    }
}

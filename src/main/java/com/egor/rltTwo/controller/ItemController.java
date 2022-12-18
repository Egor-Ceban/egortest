package com.egor.rltTwo.controller;

import com.egor.rltTwo.dto.ItemDto;
import com.egor.rltTwo.model.Item;
import com.egor.rltTwo.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

//uselesscommentknlknlk
@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;
    @PostMapping("/{shopId}")
    public Item createItem(@PathVariable Long shopId, @RequestBody ItemDto itemDto){
        return itemService.createItem(shopId, itemDto);
    }
}

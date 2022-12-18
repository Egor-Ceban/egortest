package com.egor.rltTwo.dto;

import lombok.Data;

@Data
public class ItemDto {
    private String name;
    private Double price;
    private Boolean isAvailable;
}

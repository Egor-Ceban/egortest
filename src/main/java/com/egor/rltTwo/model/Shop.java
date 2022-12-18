package com.egor.rltTwo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter

public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String shopName;
    @OneToOne
    private User owner;

    @OneToMany
    private List<Item> itemList;
}

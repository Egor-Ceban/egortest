package com.egor.rltTwo.repository;

import com.egor.rltTwo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}

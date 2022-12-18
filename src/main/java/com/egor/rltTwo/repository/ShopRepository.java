package com.egor.rltTwo.repository;

import com.egor.rltTwo.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Long> {
}

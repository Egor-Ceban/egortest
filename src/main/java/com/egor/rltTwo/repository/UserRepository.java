package com.egor.rltTwo.repository;

import com.egor.rltTwo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

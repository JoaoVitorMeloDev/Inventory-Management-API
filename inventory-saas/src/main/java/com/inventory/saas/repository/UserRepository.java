package com.inventory.saas.repository;

import com.inventory.saas.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
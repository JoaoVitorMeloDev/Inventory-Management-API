package com.inventory.saas.service;

import com.inventory.saas.entity.User;
import com.inventory.saas.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User create(User user) {
        return repository.save(user);
    }

    public List<User> list() {
        return repository.findAll();
    }
}
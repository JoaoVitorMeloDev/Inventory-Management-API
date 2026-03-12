package com.inventory.saas.controller;

import com.inventory.saas.entity.User;
import com.inventory.saas.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Tag(name = "Users", description = "Gerenciamento de usuários da empresa")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @Operation(summary = "Criar novo usuário")
    @PostMapping
    public User create(@RequestBody User user) {
        return service.create(user);
    }

    @Operation(summary = "Listar usuários")
    @GetMapping
    public List<User> list() {
        return service.list();
    }
}
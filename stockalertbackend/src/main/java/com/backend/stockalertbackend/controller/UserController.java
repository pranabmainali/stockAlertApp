package com.backend.stockalertbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.stockalertbackend.model.User;

@RestController
public class UserController {

    private User user = new User(1, "pmainali", "hello");

    @GetMapping("/getUser")
    public User getUser(long userid){
        return user;
    }
    
}

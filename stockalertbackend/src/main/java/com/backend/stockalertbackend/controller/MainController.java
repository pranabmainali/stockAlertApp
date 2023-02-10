package com.backend.stockalertbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.stockalertbackend.model.User;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    private List<User> usersList = new ArrayList<>();

    @GetMapping("/registerUser")
    public User registerUser(int id, String username, String password, int phoneNumber){
        User newUser = new User(id, username, password, phoneNumber);
        this.usersList.add(newUser);

        return newUser;
    }

    @GetMapping("/loginUser")
    public User registerUser(int id, String username, String password, int phoneNumber){
        User newUser = new User(id, username, password, phoneNumber);
        this.usersList.add(newUser);

        return newUser;
    }
    
}

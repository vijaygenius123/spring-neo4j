package com.vijaygenius123.springneo4j.controller;

import com.vijaygenius123.springneo4j.model.User;
import com.vijaygenius123.springneo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public Collection<User> getAll(){
        return userService.getAll();
    }

}


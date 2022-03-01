package com.vijaygenius123.springneo4j.service;

import com.vijaygenius123.springneo4j.model.User;
import com.vijaygenius123.springneo4j.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Collection<User> getAll() {
        return userRepository.getAllUsers();
    }
}

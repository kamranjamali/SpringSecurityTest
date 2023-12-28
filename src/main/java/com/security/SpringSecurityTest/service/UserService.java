package com.security.SpringSecurityTest.service;

import com.security.SpringSecurityTest.entities.User;
import com.security.SpringSecurityTest.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder  passwordEncoder;

    public List<User> getAllUsers() {
        return this.userRepo.findAll();
    }

    public User createUser(User user) {
        user.setId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }
}

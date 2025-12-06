package com.org.hospitalmanagementapp.service.impl;


import com.org.hospitalmanagementapp.entity.User;
import com.org.hospitalmanagementapp.repo.UserRepo;
import com.org.hospitalmanagementapp.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceimpl implements UserService {
    private final UserRepo userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceimpl(UserRepo userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public String register(User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            return "Email already exists!";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User registered successfully!";
    }

    public String login(String email, String password) {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isEmpty()) {
            return "User not found!";
        }
        User user = optionalUser.get();
        if (passwordEncoder.matches(password, user.getPassword())) {
            return "Login successful!";
        } else {
            return "Invalid password!";
        }
    }
}

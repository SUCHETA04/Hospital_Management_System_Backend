package com.org.hospitalmanagementapp.controller;

import com.org.hospitalmanagementapp.entity.User;
import com.org.hospitalmanagementapp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin

public class UserLoginController {
    private final UserService userService;
    public UserLoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> data) {
        return userService.login(data.get("email"), data.get("password"));
    }

}

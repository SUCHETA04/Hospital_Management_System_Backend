package com.org.hospitalmanagementapp.service;

import com.org.hospitalmanagementapp.entity.User;

public interface UserService {
    public String login(String email, String password);
    public String register(User user);
}

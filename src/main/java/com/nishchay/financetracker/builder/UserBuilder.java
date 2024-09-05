package com.nishchay.financetracker.builder;

import com.nishchay.financetracker.dto.CreateUserRequest;
import com.nishchay.financetracker.model.User;

import java.time.LocalDateTime;

public class UserBuilder {

    public static User createUser(CreateUserRequest createUserRequest) {
        User user = new User();
        user.setUsername(createUserRequest.getUsername());
        user.setEmail(createUserRequest.getEmail());
        user.setPassword(createUserRequest.getPassword());
        user.setRegistrationDateTime(LocalDateTime.now());
        return user;
    }

    public static User updateUser(User user, CreateUserRequest createUserRequest) {
        user.setUsername(createUserRequest.getUsername());
        user.setPassword(createUserRequest.getPassword());
        user.setEmail(createUserRequest.getEmail());
        return user;
    }
}

package com.nishchay.financetracker.service;

import com.nishchay.financetracker.dto.CreateUserRequest;
import com.nishchay.financetracker.dto.GetUserResponse;
import com.nishchay.financetracker.model.User;

public interface UserService {

    public GetUserResponse create(CreateUserRequest createUserRequest);

    public GetUserResponse get(long userId);

    public GetUserResponse update(long userId, CreateUserRequest updateUserRequest);

    public void delete(long userId);

    public User getUserForTransaction(long userId);
}

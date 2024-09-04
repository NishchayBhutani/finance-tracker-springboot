package com.nishchay.financetracker.service;

import com.nishchay.financetracker.dto.CreateUserRequest;
import com.nishchay.financetracker.dto.GetUserResponse;

public interface UserService {

    public GetUserResponse create(CreateUserRequest createUserRequest);

    public GetUserResponse get(int userId);

    public GetUserResponse update(CreateUserRequest updateUserRequest);

    public void delete(int userId);
}

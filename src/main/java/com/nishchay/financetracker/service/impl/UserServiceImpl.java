package com.nishchay.financetracker.service.impl;

import com.nishchay.financetracker.dto.CreateUserRequest;
import com.nishchay.financetracker.dto.GetUserResponse;
import com.nishchay.financetracker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    @Override
    public GetUserResponse create(CreateUserRequest createUserRequest) {
        return null;
    }

    @Override
    public GetUserResponse get(int userId) {
        return null;
    }

    @Override
    public GetUserResponse update(CreateUserRequest updateUserRequest) {
        return null;
    }

    @Override
    public void delete(int userId) {

    }
}

package com.nishchay.financetracker.service.impl;

import com.nishchay.financetracker.builder.GetUserResponseBuilder;
import com.nishchay.financetracker.builder.UserBuilder;
import com.nishchay.financetracker.dto.CreateUserRequest;
import com.nishchay.financetracker.dto.GetUserResponse;
import com.nishchay.financetracker.exception.UserException;
import com.nishchay.financetracker.model.User;
import com.nishchay.financetracker.repository.UserRepository;
import com.nishchay.financetracker.service.UserService;
import com.nishchay.financetracker.util.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public GetUserResponse create(CreateUserRequest createUserRequest) {
        User user = UserBuilder.createUser(createUserRequest);
        userRepository.save(user);
        return GetUserResponseBuilder.createGetUserResponse(user);
    }

    @Override
    public GetUserResponse get(long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        User user = userOptional.orElseThrow(() -> new UserException(Constants.USER_NOT_FOUND));
        return GetUserResponseBuilder.createGetUserResponse(userOptional.get());
    }

    @Override
    public GetUserResponse update(long userId, CreateUserRequest updateUserRequest) throws UserException{
        Optional<User> userOptional = userRepository.findById(userId);
        User user = userOptional.orElseThrow(() -> new UserException(Constants.USER_NOT_FOUND));
        UserBuilder.updateUser(user, updateUserRequest);
        userRepository.save(user);
        return GetUserResponseBuilder.createGetUserResponse(user);
    }

    @Override
    public void delete(long userId) {
        userRepository.deleteById(userId);
    }
}

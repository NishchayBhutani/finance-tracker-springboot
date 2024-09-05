package com.nishchay.financetracker.builder;

import com.nishchay.financetracker.dto.GetUserResponse;
import com.nishchay.financetracker.model.User;

public class GetUserResponseBuilder {

    public static GetUserResponse createGetUserResponse(User user) {
        GetUserResponse getUserResponse = new GetUserResponse();
        getUserResponse.setId(user.getId());
        getUserResponse.setUsername(user.getUsername());
        getUserResponse.setEmail(user.getEmail());
        getUserResponse.setRegistrationDateTime(user.getRegistrationDateTime());
        return getUserResponse;
    }
}

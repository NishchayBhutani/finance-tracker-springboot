package com.nishchay.financetracker.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GetUserResponse {
    private long id;
    private String username;
    private String email;
    private LocalDateTime registrationDateTime;
}

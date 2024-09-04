package com.nishchay.financetracker.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GetUserResponse {
    private int id;
    private String username;
    private String email;
    private LocalDateTime registrationDateTime;
}

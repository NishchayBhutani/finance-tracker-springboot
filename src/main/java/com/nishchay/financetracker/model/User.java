package com.nishchay.financetracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "app_user")
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String email;
    private String password;
    private LocalDateTime registrationDateTime;
}

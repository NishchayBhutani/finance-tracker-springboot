package com.nishchay.financetracker.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Transaction {
    @Id
    @GeneratedValue
    private long id;
    private Double amount;
    private String name;
    private String description;
    private String paymentMethod;
    @ManyToOne
    private User user;
    @ManyToOne
    private Category category;
}

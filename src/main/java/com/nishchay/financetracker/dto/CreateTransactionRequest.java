package com.nishchay.financetracker.dto;

import lombok.Data;

@Data
public class CreateTransactionRequest {
    private Double amount;
    private String name;
    private String description;
    private String paymentMethod;
    private String categoryName;
}

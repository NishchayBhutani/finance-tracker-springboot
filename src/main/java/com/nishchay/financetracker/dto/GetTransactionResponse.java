package com.nishchay.financetracker.dto;

import com.nishchay.financetracker.model.Category;
import com.nishchay.financetracker.model.User;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class GetTransactionResponse {
    private long id;
    private Double amount;
    private String name;
    private String description;
    private String paymentMethod;
    private GetUserResponse user;
    private GetCategoryResponse category;
}

package com.nishchay.financetracker.dto;

import lombok.Data;

@Data
public class CreateCategoryRequest {
    private String name;
    private String description;
}

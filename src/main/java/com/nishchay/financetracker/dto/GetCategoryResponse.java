package com.nishchay.financetracker.dto;

import lombok.Data;

@Data
public class GetCategoryResponse {
    private long id;
    private String name;
    private String description;
}

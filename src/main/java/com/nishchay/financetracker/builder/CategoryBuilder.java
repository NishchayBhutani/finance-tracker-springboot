package com.nishchay.financetracker.builder;

import com.nishchay.financetracker.dto.CreateCategoryRequest;
import com.nishchay.financetracker.model.Category;

public class CategoryBuilder {

    public static Category createCategory(CreateCategoryRequest createCategoryRequest) {
        Category category = new Category();
        category.setName(createCategoryRequest.getName());
        category.setDescription(createCategoryRequest.getDescription());
        return category;
    }

    public static Category updateCategory(Category category, CreateCategoryRequest createCategoryRequest) {
        category.setName(createCategoryRequest.getName());
        category.setDescription(createCategoryRequest.getDescription());
        return category;
    }
}

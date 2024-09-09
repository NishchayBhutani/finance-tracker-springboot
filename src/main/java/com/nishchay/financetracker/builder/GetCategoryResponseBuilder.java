package com.nishchay.financetracker.builder;

import com.nishchay.financetracker.dto.GetCategoryResponse;
import com.nishchay.financetracker.model.Category;

public class GetCategoryResponseBuilder {

    public static GetCategoryResponse createGetCategoryResponse(Category category) {
        GetCategoryResponse getCategoryResponse = new GetCategoryResponse();
        getCategoryResponse.setId(category.getId());
        getCategoryResponse.setName(category.getName());
        getCategoryResponse.setDescription(category.getDescription());
        return getCategoryResponse;
    }
}

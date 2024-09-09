package com.nishchay.financetracker.service;

import com.nishchay.financetracker.dto.CreateCategoryRequest;
import com.nishchay.financetracker.dto.CreateTransactionRequest;
import com.nishchay.financetracker.dto.GetCategoryResponse;
import com.nishchay.financetracker.model.Category;

public interface CategoryService {

    public GetCategoryResponse create(CreateCategoryRequest createCategoryRequest);

    public GetCategoryResponse get(long categoryId);

    public GetCategoryResponse update(long categoryId, CreateCategoryRequest updateCategoryRequest);

    public void delete(long categoryId);

    public Category getByName(String categoryName);
}

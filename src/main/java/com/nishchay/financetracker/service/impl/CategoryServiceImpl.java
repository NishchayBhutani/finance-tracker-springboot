package com.nishchay.financetracker.service.impl;

import com.nishchay.financetracker.builder.CategoryBuilder;
import com.nishchay.financetracker.builder.GetCategoryResponseBuilder;
import com.nishchay.financetracker.dto.CreateCategoryRequest;
import com.nishchay.financetracker.dto.GetCategoryResponse;
import com.nishchay.financetracker.exception.CategoryException;
import com.nishchay.financetracker.model.Category;
import com.nishchay.financetracker.repository.CategoryRepository;
import com.nishchay.financetracker.service.CategoryService;
import com.nishchay.financetracker.util.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public GetCategoryResponse create(CreateCategoryRequest createCategoryRequest) {
        Category category = CategoryBuilder.createCategory(createCategoryRequest);
        categoryRepository.save(category);
        return GetCategoryResponseBuilder.createGetCategoryResponse(category);
    }

    @Override
    public GetCategoryResponse get(long categoryId) {
        Category category = categoryRepository.findById(categoryId).orElseThrow(() -> new CategoryException(Constants.CATEGORY_NOT_FOUND));
        return GetCategoryResponseBuilder.createGetCategoryResponse(category);
    }

    @Override
    public GetCategoryResponse update(long categoryId, CreateCategoryRequest updateCategoryRequest) {
        Category category = categoryRepository.findById(categoryId).orElseThrow(() -> new CategoryException(Constants.CATEGORY_NOT_FOUND));
        CategoryBuilder.updateCategory(category, updateCategoryRequest);
        categoryRepository.save(category);
        return GetCategoryResponseBuilder.createGetCategoryResponse(category);
    }

    @Override
    public void delete(long categoryId) {
        categoryRepository.deleteById(categoryId);
    }

    @Override
    public Category getByName(String categoryName) {
        Category category = categoryRepository.findByName(categoryName).orElseThrow(() -> new CategoryException(Constants.CATEGORY_NOT_FOUND_WITH_NAME));
        return category;
    }
}

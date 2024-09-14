package com.nishchay.financetracker.controller;

import com.nishchay.financetracker.dto.CreateCategoryRequest;
import com.nishchay.financetracker.dto.GetCategoryResponse;
import com.nishchay.financetracker.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryRestController {

    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<GetCategoryResponse> createCategory(@RequestBody CreateCategoryRequest createCategoryRequest) {
        return new ResponseEntity<>(categoryService.create(createCategoryRequest), HttpStatus.CREATED);
    }

    @GetMapping("/{categoryId}")
    public ResponseEntity<GetCategoryResponse> getCategory(@PathVariable long categoryId) {
        return new ResponseEntity<>(categoryService.get(categoryId), HttpStatus.OK);
    }

    @PutMapping("/{categoryId}")
    public ResponseEntity<GetCategoryResponse> updateCategory(@PathVariable long categoryId, @RequestBody CreateCategoryRequest updateCategoryRequest) {
        return new ResponseEntity<>(categoryService.update(categoryId, updateCategoryRequest), HttpStatus.OK);
    }

    @DeleteMapping("/{categoryId}")
    public ResponseEntity<Void> deleteCategory(@PathVariable long categoryId) {
        categoryService.delete(categoryId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

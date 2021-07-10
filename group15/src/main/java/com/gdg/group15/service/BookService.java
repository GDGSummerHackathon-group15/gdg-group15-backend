package com.gdg.group15.service;

import com.gdg.group15.domain.Category;
import com.gdg.group15.domain.Roadmap;
import com.gdg.group15.exception.CategoryNotFoundException;
import com.gdg.group15.repository.BookRepository;
import com.gdg.group15.repository.CategoryRepository;
import com.gdg.group15.web.dto.response.CategoryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    private final CategoryRepository categoryRepository;

    public List<CategoryResponse> getCategories() {
        return categoryRepository.findAll().stream().map(CategoryResponse::of).collect(Collectors.toList());
    }

    public CategoryResponse getCategory(Long categoryId) {
        return CategoryResponse.of(findCategoryById(categoryId));
    }

    private Category findCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId).orElseThrow(CategoryNotFoundException::new);
    }
}

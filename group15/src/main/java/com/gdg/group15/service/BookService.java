package com.gdg.group15.service;

import com.gdg.group15.domain.Book;
import com.gdg.group15.domain.Category;
import com.gdg.group15.domain.Roadmap;
import com.gdg.group15.exception.BookNotFoundException;
import com.gdg.group15.exception.CategoryNotFoundException;
import com.gdg.group15.exception.RoadmapNotFoundException;
import com.gdg.group15.repository.BookRepository;
import com.gdg.group15.repository.CategoryRepository;
import com.gdg.group15.repository.RoadmapRepository;
import com.gdg.group15.web.dto.response.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    private final CategoryRepository categoryRepository;
    private final BookRepository bookRepository;
    private final RoadmapRepository roadmapRepository;

    public List<CategoryResponse> getCategories() {
        return categoryRepository.findAll().stream().map(CategoryResponse::of).collect(Collectors.toList());
    }

    public CategoryResponse getCategory(Long categoryId) {
        return CategoryResponse.of(findCategoryById(categoryId));
    }

    public BookResponse getBook(Long bookId) {
        return BookResponse.of(findBookById(bookId));
    }

    private Book findBookById(Long bookId) {
        return bookRepository.findById(bookId).orElseThrow(BookNotFoundException::new);
    }

    private Category findCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId).orElseThrow(CategoryNotFoundException::new);
    }

    public List<RoadmapResponse> getFilteredRoadmaps(Long categoryId, String roadmap) { // <-
        String[] roadmaps = roadmap.split(",");
        List<RoadmapResponse> roadmap_list = new ArrayList<>();

        for (int i = 0; i < roadmaps.length; i++) {
            roadmap_list.add(getRoadmap(roadmaps[i]));
        }

        return roadmap_list;
    }

    public RoadmapResponse getRoadmap(String title) {
        return RoadmapResponse.of(findRoadmapByTitle(title));
    }

    private Roadmap findRoadmapByTitle(String title) {
        return roadmapRepository.findByTitle(title).orElseThrow(RoadmapNotFoundException::new);
    }
}

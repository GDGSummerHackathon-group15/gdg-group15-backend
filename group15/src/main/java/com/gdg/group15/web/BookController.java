package com.gdg.group15.web;

import com.gdg.group15.service.BookService;
import com.gdg.group15.web.dto.response.BookResponse;
import com.gdg.group15.web.dto.response.CategoryResponse;
import com.gdg.group15.web.dto.response.RoadmapResponse;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    @GetMapping("/categories")
    public ResponseEntity<List<CategoryResponse>> list() {
        return ResponseEntity.ok(bookService.getCategories());
    }

    @GetMapping("/categories/{categoryId}")
    public ResponseEntity<CategoryResponse> viewCategory(@PathVariable Long categoryId) {
        return ResponseEntity.ok(bookService.getCategory(categoryId));
    }

    @RequestMapping(value = "/categories/{categoryId}", params = "roadmap")
    public ResponseEntity<List<RoadmapResponse>> viewFilteredRoadmaps(@PathVariable Long categoryId,
                                                                      @RequestParam String roadmap) {
        return ResponseEntity.ok(bookService.getFilteredRoadmaps(categoryId, roadmap));
    }

    @GetMapping("/books/{bookId}")
    public ResponseEntity<BookResponse> viewBookDetailPage(@PathVariable Long bookId) {
        return ResponseEntity.ok(bookService.getBook(bookId));
    }
}

package com.gdg.group15.service;

import com.gdg.group15.domain.*;
import com.gdg.group15.exception.BookNotFoundException;
import com.gdg.group15.exception.CategoryNotFoundException;
import com.gdg.group15.exception.RoadmapNotFoundException;
import com.gdg.group15.repository.BookRepository;
import com.gdg.group15.repository.CategoryRepository;
import com.gdg.group15.repository.ReviewRepository;
import com.gdg.group15.repository.RoadmapRepository;
import com.gdg.group15.web.dto.request.ReviewRequest;
import com.gdg.group15.web.dto.response.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    private final CategoryRepository categoryRepository;
    private final BookRepository bookRepository;
    private final RoadmapRepository roadmapRepository;
    private final ReviewRepository reviewRepository;
    private final UserService userService;

    public List<CategoryResponse> getCategories() {
        return categoryRepository.findAll().stream().map(CategoryResponse::of).collect(Collectors.toList());
    }

    public CategoryResponse getCategory(Long categoryId) {
        return CategoryResponse.of(findCategoryById(categoryId));
    }

    public BookResponse getBook(Long bookId) {
        return BookResponse.of(findBookById(bookId));
    }

    public List<RoadmapResponse> getFilteredRoadmaps(Long categoryId, String roadmap) {
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

    @Transactional
    public ReviewResponse saveReview(Long userId, Long bookId, ReviewRequest reviewRequest) {
        User author = userService.findUserById(userId);
        Book book = findBookById(bookId);
        Review review = new Review(author, reviewRequest.getAverageRating(), reviewRequest.getContent(), book);
        return ReviewResponse.of(reviewRepository.save(review));
    }

    @Transactional
    public ReviewResponse updateReview(Long reviewId, ReviewRequest reviewRequest) {
        Review review = findReviewById(reviewId);
        Review updatedReview = reviewRepository.save(review.update(reviewRequest));
        return ReviewResponse.of(updatedReview);
    }

    private Review findReviewById(Long reviewId) {
        return reviewRepository.findById(reviewId).orElseThrow(()-> new RuntimeException("리뷰를 찾을 수 없습니다."));
    }

    private Roadmap findRoadmapByTitle(String title) {
        return roadmapRepository.findByTitle(title).orElseThrow(RoadmapNotFoundException::new);
    }

    private Book findBookById(Long bookId) {
        return bookRepository.findById(bookId).orElseThrow(BookNotFoundException::new);
    }

    private Category findCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId).orElseThrow(CategoryNotFoundException::new);
    }

}

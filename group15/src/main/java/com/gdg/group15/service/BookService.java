package com.gdg.group15.service;

import com.gdg.group15.domain.*;
import com.gdg.group15.exception.BookNotFoundException;
import com.gdg.group15.exception.CategoryNotFoundException;
import com.gdg.group15.exception.RoadmapNotFoundException;
import com.gdg.group15.repository.*;
import com.gdg.group15.web.dto.request.ReviewRequest;
import com.gdg.group15.web.dto.response.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    private final PartRepository partRepository;
    private final BookRepository bookRepository;
    private final MainCategoryRepository mainCategoryRepository;
    private final SubCategoryRepository subCategoryRepository;
    private final ReviewRepository reviewRepository;
    private final UserService userService;

    public List<PartResponse> getParts() {
        return partRepository.findAll().stream().map(PartResponse::of).collect(Collectors.toList());
    }

    public BookResponse getBook(Long bookId) {
        return BookResponse.of(findBookById(bookId));
    }

    public List<MainCategoryResponse> getMainCategories(Long partId) {
        Part part = findPartById(partId);
        return part.getMainCategories().stream().map(MainCategoryResponse::of).collect(Collectors.toList());
    }

    public List<BookResponse> getAllBooksBySubCategory(Long subCategoryId) {
        SubCategory subCategory = findSubCategoryById(subCategoryId);
        return subCategory.getBooks().stream().map(BookResponse::of).collect(Collectors.toList());
    }

    @Transactional
    public ReviewResponse createReview(Long userId, Long bookId, ReviewRequest reviewRequest) {
        User author = userService.findUserById(userId);
        Book book = findBookById(bookId);
        Review review = new Review(author, reviewRequest.getAverageRating(), reviewRequest.getContent(), book);
        Review savedReview = reviewRepository.save(review);
        bookRepository.save(book.addReview(savedReview));
        return ReviewResponse.of(savedReview);
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

    private MainCategory findMainCategoryByTitle(String title) {
        return mainCategoryRepository.findByTitle(title).orElseThrow(RoadmapNotFoundException::new);
    }

    private SubCategory findSubCategoryById(Long id) {
        return subCategoryRepository.findById(id).orElseThrow(()-> new RuntimeException("SubCategory를 찾을 수 없습니다."));
    }

    public Book findBookById(Long bookId) {
        return bookRepository.findById(bookId).orElseThrow(BookNotFoundException::new);
    }

    private Part findPartById(Long partId) {
        return partRepository.findById(partId).orElseThrow(CategoryNotFoundException::new);
    }

}

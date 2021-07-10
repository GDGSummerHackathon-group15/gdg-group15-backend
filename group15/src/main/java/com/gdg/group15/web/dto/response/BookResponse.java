package com.gdg.group15.web.dto.response;

import com.gdg.group15.domain.Review;
import com.gdg.group15.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
@AllArgsConstructor
public class BookResponse {
    private Long bookId;
    private String title;
    private String description;
    private List<ReviewResponse> reviews;

    public static BookResponse of(Book book) {
        return BookResponse.builder()
                .bookId(book.getId())
                .title(book.getTitle())
                .description(book.getDescription())
                .reviews(book.getReviews().stream().map(ReviewResponse::of).collect(Collectors.toList()))
                .build();
    }
}

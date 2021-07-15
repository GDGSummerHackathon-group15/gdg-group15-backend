package com.gdg.group15.web.dto.response;

import com.gdg.group15.domain.Book;
import com.gdg.group15.domain.Wish;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class WishResponse {
    private Long bookId;
    private Long wishId;
    private String title;
    private String description;
    private String imageUrl;

    public static WishResponse of(Wish wish) {
        Book book = wish.getBook();
        return WishResponse.builder()
                .bookId(book.getId())
                .wishId(wish.getId())
                .title(book.getTitle())
                .description(book.getDescription())
                .imageUrl(book.getImageUrl())
                .build();
    }
}

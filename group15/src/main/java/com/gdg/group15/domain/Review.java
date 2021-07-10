package com.gdg.group15.domain;

import com.gdg.group15.web.dto.request.ReviewRequest;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Review extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User author;
    private double averageRating;
    private String content;

    @ManyToOne
    private Book book;

    public Review(User author, double averageRating, String content, Book book) {
        this.author = author;
        this.averageRating = averageRating;
        this.content = content;
        this.book = book;
    }

    public Review update(ReviewRequest reviewRequest) {
        this.averageRating = reviewRequest.getAverageRating();
        this.content = reviewRequest.getContent();
        return this;
    }


}

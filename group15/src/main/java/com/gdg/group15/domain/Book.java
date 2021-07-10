package com.gdg.group15.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gdg.group15.web.dto.response.ReviewResponse;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String imageUrl;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Wish> wishes;

    @OneToMany
    private List<Review> reviews;

    public double calculateAverage() {
        return reviews.stream()
                .mapToDouble(Review::getAverageRating)
                .average()
                .orElse(0.0);
    }

    public long getReviewerCount() {
        return reviews.size();
    }

    public Book addWish(Wish wish) {
        wishes.add(wish);
        return this;
    }

    public Book addReview(Review review) {
        reviews.add(review);
        return this;
    }
}

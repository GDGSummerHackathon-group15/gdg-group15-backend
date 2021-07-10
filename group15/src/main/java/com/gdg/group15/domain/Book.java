package com.gdg.group15.domain;

import com.gdg.group15.web.dto.response.ReviewResponse;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String imageUrl;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
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
}

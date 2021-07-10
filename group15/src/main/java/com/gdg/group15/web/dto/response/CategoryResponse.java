package com.gdg.group15.web.dto.response;

import com.gdg.group15.domain.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
@AllArgsConstructor
public class CategoryResponse {
    private final Long categoryId;
    private final List<RoadmapResponse> roadmapResponses;

    public static CategoryResponse of(Category category) {
        return CategoryResponse.builder()
                .categoryId(category.getId())
                .roadmapResponses(category.getRoadmaps().stream().map(RoadmapResponse::of).collect(Collectors.toList()))
                .build();
    }
}

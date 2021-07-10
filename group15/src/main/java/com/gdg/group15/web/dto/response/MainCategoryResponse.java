package com.gdg.group15.web.dto.response;

import com.gdg.group15.domain.MainCategory;
import com.gdg.group15.domain.SubCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
@AllArgsConstructor
public class MainCategoryResponse {
    private final Long mainCategoryId;
    private final String title;
    private final List<SubCategoryResponse> subCategoryResponses;

    public static MainCategoryResponse of(MainCategory mainCategory) {
        return MainCategoryResponse.builder()
                .mainCategoryId(mainCategory.getId())
                .title(mainCategory.getTitle())
                .subCategoryResponses(mainCategory.getSubCategories().stream()
                        .map(SubCategoryResponse::of)
                        .collect(Collectors.toList()))
                .build();
    }
}

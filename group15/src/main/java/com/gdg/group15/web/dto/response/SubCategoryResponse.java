package com.gdg.group15.web.dto.response;

import com.gdg.group15.domain.Book;
import com.gdg.group15.domain.SubCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class SubCategoryResponse {
    private final Long subCategoryId;
    private final String title;

    public static SubCategoryResponse of(SubCategory subCategory) {
        return SubCategoryResponse.builder()
                .subCategoryId(subCategory.getId())
                .title(subCategory.getTitle())
                .build();
    }
}

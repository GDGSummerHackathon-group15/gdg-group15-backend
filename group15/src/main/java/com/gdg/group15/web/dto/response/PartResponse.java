package com.gdg.group15.web.dto.response;

import com.gdg.group15.domain.Part;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
@AllArgsConstructor
public class PartResponse {
    private final Long partId;
    private final String partName;

    public static PartResponse of(Part part) {
        return PartResponse.builder()
                .partId(part.getId())
                .partName(part.getName())
                .build();
    }
}

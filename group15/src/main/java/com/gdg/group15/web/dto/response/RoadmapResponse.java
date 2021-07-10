package com.gdg.group15.web.dto.response;

import com.gdg.group15.domain.Roadmap;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class RoadmapResponse {
    private final Long roadmapId;
    private final String title;
    private final String description;
    private final String imageUrl;

    public static RoadmapResponse of(Roadmap roadmap) {
        return RoadmapResponse.builder()
                .roadmapId(roadmap.getId())
                .title(roadmap.getTitle())
                .description(roadmap.getDescription())
                .imageUrl(roadmap.getImageUrl())
                .build();
    }
}

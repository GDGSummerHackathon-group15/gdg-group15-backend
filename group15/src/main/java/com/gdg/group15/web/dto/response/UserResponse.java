package com.gdg.group15.web.dto.response;

import com.gdg.group15.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class UserResponse {
    private Long userId;
    private String avatarUrl;
    private String name;

    public static UserResponse of(User user) {
        return UserResponse.builder()
                .userId(user.getId())
                .avatarUrl(user.getAvatarUrl())
                .name(user.getName())
                .build();
    }
}

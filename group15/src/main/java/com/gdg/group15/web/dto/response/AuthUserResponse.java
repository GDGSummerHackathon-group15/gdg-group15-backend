package com.gdg.group15.web.dto.response;

import com.gdg.group15.auth.service.JwtService;
import com.gdg.group15.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
public class AuthUserResponse {
    private final String avatarUrl;
    private final String name;
    private final String jwt;

    public static AuthUserResponse of(User user, String token) {
        return AuthUserResponse.builder()
                .avatarUrl(user.getAvatarUrl())
                .name(user.getName())
                .jwt(token)
                .build();
    }
}

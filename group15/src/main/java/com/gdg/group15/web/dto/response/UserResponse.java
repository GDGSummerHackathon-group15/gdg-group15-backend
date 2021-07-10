package com.gdg.group15.web.dto.response;

import com.gdg.group15.domain.User;
import com.gdg.group15.domain.Wish;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class UserResponse {

    private final Long userId;
    private final String userName;
    private final List<Wish> wishes;

    public static UserResponse of(User user) {
        return UserResponse.builder()
                .userId(user.getId())
                .userName(user.getName())
                .wishes(user.getWishes())
                .build();
    }

}

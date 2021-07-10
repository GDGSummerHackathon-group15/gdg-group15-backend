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
public class UserWishResponse {

    private final Long userId;
    private final String avatarUrl;
    private final String userName;
    private final List<Wish> wishes;

    public static UserWishResponse of(User user) {
        return UserWishResponse.builder()
                .userId(user.getId())
                .avatarUrl(user.getAvatarUrl())
                .userName(user.getName())
                .wishes(user.getWishes())
                .build();
    }

}

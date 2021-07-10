package com.gdg.group15.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gdg.group15.auth.dto.OAuthUserResponseDTO;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String avatarUrl;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Wish> wishes = new ArrayList<>();

    @Builder
    public User(String name, String avatarUrl) {
        this.name = name;
        this.avatarUrl = avatarUrl;
    }

    public static User of(OAuthUserResponseDTO authUser) {
        return User.builder()
                .name(authUser.getLogin())
                .avatarUrl(authUser.getAvatarUrl())
                .build();
    }
}

package com.gdg.group15.service;

import com.gdg.group15.domain.User;
import com.gdg.group15.repository.UserRepository;
import com.gdg.group15.web.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponse findUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("사용자를 찾을 수 없습니다."));
        return UserResponse.of(user);
    }
}

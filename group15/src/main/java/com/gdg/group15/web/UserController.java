package com.gdg.group15.web;

import com.gdg.group15.service.UserService;
import com.gdg.group15.web.dto.response.UserWishResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<UserWishResponse> userInfo(@PathVariable("userId") Long userId) throws Exception {
        return ResponseEntity.ok(userService.findUser(userId));
    }
}

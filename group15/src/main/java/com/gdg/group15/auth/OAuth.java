package com.gdg.group15.auth;

import com.gdg.group15.auth.dto.AccessTokenResponseDTO;
import com.gdg.group15.auth.dto.OAuthUserResponseDTO;

public interface OAuth {
    AccessTokenResponseDTO getToken(String code);

    OAuthUserResponseDTO getUserInfo(String token);
}

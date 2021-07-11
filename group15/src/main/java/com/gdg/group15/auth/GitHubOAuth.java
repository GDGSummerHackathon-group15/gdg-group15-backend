package com.gdg.group15.auth;

import com.gdg.group15.auth.dto.AccessTokenRequestDTO;
import com.gdg.group15.auth.dto.AccessTokenResponseDTO;
import com.gdg.group15.auth.dto.OAuthUserResponseDTO;
import com.gdg.group15.auth.exception.AccessTokenNotFoundException;
import com.gdg.group15.auth.exception.GitHubUserNotFoundException;
import com.gdg.group15.auth.exception.InvalidGitHubRequestException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class GitHubOAuth implements OAuth {
    private static final String TOKEN = "token";
    private final WebClient webClient;
    private final String accessTokenUri;
    private final String userUri;
    private final String clientId;
    private final String clientSecret;

    public GitHubOAuth(WebClient webClient,
                       @Value("${github.access.token.uri}") String accessTokenUri,
                       @Value("${github.user.uri}") String userUri,
                       @Value("${github.web.client.id}") String clientId,
                       @Value("${github.web.client.secret}") String clientSecret) {
        this.webClient = webClient;
        this.accessTokenUri = accessTokenUri;
        this.userUri = userUri;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    @Override
    public AccessTokenResponseDTO getToken(String code) {
        AccessTokenRequestDTO accessTokenRequest = AccessTokenRequestDTO.builder()
                .clientId(clientId)
                .clientSecret(clientSecret)
                .code(code)
                .build();

        return webClient.post()
                .uri(accessTokenUri)
                .accept(MediaType.APPLICATION_JSON)
                .bodyValue(accessTokenRequest)
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError, error -> Mono.error(InvalidGitHubRequestException::new))
                .bodyToMono(AccessTokenResponseDTO.class)
                .blockOptional()
                .orElseThrow(AccessTokenNotFoundException::new);
    }

    @Override
    public OAuthUserResponseDTO getUserInfo(String accessToken) {
        System.out.println("accesst token: " + accessToken);
        return webClient.get()
                .uri(userUri)
                .accept(MediaType.APPLICATION_JSON)
                .header(HttpHeaders.AUTHORIZATION, TOKEN + " " + accessToken)
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError, error -> Mono.error(InvalidGitHubRequestException::new))
                .bodyToMono(OAuthUserResponseDTO.class)
                .blockOptional()
                .orElseThrow(GitHubUserNotFoundException::new);
    }

}

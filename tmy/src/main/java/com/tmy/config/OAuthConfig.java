package com.tmy.config;

import org.scribe.builder.ServiceBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tmy.oauth.api.GithubApi;
import com.tmy.oauth.service.GithubOAuthService;
import com.tmy.oauth.service.OAuthServiceDeractor;

@Configuration
public class OAuthConfig {
    
    private static final String CALLBACK_URL = "%s/oauth/%s/callback";
    
    @Value("${oAuth.xinalng.state}")
    String state;
    @Value("${oAuth.xinalng.clientId}")
    String xinlangClientId;
    @Value("${oAuth.xinlang.clientSecret}")
    String xinalngClientSecret;
    @Value("${demo.host}")
    String host;
    
    @Bean
    public GithubApi githubApi(){
        return new GithubApi(state);
    }
    
    @Bean
    public OAuthServiceDeractor getGithubOAuthService(){
        return new GithubOAuthService(new ServiceBuilder()
            .provider(githubApi())
            .apiKey(xinlangClientId)
            .apiSecret(xinalngClientSecret)
            .callback(String.format(CALLBACK_URL, host, OAuthTypes.XINLANG))
            .build());
    }
    

}

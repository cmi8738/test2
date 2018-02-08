package com.tmy.oauth.api;

import org.scribe.builder.api.DefaultApi20;
import org.scribe.model.OAuthConfig;
import org.scribe.utils.OAuthEncoder;

public class GithubApi extends DefaultApi20 {
    
    private static final String AUTHORIZE_URL = "https://api.weibo.com/oauth2/authorize?client_id=YOUR_CLIENT_ID&response_type=code&redirect_uri=YOUR_REGISTERED_REDIRECT_URI";
    private static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL + "&scope=%s";
    private static final String ACCESS_TOKEN_URL = "https://api.weibo.com/oauth2/access_token?client_id=YOUR_CLIENT_ID&client_secret=YOUR_CLIENT_SECRET&grant_type=authorization_code&redirect_uri=YOUR_REGISTERED_REDIRECT_URI&code=CODE";
    
    private final String xinlangState;
    
    public GithubApi(String state){
        this.xinlangState = state;
    }
    
    @Override
    public String getAuthorizationUrl(OAuthConfig config) {
        if (config.hasScope()){
          return String.format(SCOPED_AUTHORIZE_URL, config.getApiKey(), OAuthEncoder.encode(config.getCallback()),
                  xinlangState, OAuthEncoder.encode(config.getScope()));
        }
        else{
          return String.format(AUTHORIZE_URL, config.getApiKey(), OAuthEncoder.encode(config.getCallback()), xinlangState);
        }
    }

    @Override
    public String getAccessTokenEndpoint() {
        return String.format(ACCESS_TOKEN_URL, xinlangState);
    }

}

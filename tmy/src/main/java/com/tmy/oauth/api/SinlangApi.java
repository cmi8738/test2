package com.tmy.oauth.api;

import org.scribe.builder.api.DefaultApi20;
import org.scribe.model.OAuthConfig;

public class SinlangApi extends DefaultApi20{

    private static final String AUTHORIZE_URL = "";


    @Override
    public String getAccessTokenEndpoint() {
        return null;
    }

    @Override
    public String getAuthorizationUrl(OAuthConfig oAuthConfig) {
        return null;
    }
}

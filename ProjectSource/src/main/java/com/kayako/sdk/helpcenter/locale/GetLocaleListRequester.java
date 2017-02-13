package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.base.requester.GetRequestProperty;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/09/16
 */
public class GetLocaleListRequester implements GetRequestProperty {

    public static final String ENDPOINT = "/api/v1/locales.json";
    public static final String INCLUDE = "locale";
    private static final String ARG_OFFSET = "offset";
    private static final String ARG_LIMIT = "limit";

    private String mHelpCenterUrl;

    public GetLocaleListRequester(String helpCenterUrl) {
        mHelpCenterUrl = helpCenterUrl;
    }

    @Override
    public String getHelpCenterUrl() {
        return mHelpCenterUrl;
    }

    @Override
    public String getInclude() {
        return INCLUDE;
    }

    @Override
    public String getEndpointUrl() {
        return ENDPOINT;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        return null;
    }

    @Override
    public Map<String, String> getHeaders() {
        return null;
    }

    @Override
    public METHOD getMethod() {
        return METHOD.GET;
    }

}
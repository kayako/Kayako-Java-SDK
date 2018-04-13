package com.kayako.sdk.base.requester;

import java.util.Map;

public abstract class AbstractRequestProperty extends GetRequestProperty {

  private final String helpCenterUrl;
  private final String endpointUrl;
  private final Map<String, String> queryParameters;
  private final Map<String, String> headers;
  private final IncludeArgument include;
  private final Map<String, String> bodyParameters;

  AbstractRequestProperty(String endpointUrl, String helpCenterUrl,
      Map<String, String> queryParameters, Map<String, String> headers, IncludeArgument include,
      Map<String, String> bodyParameters) {   
    this.endpointUrl = endpointUrl;
    this.helpCenterUrl = helpCenterUrl;
    this.queryParameters = queryParameters;
    this.headers = headers;
    this.include = include;
    this.bodyParameters = bodyParameters;
  }

  public Map<String, String> getBodyParameters() {
    return bodyParameters;
  }

  @Override
  public String getHelpCenterUrl() {
    return helpCenterUrl;
  }

  @Override
  public String getEndpointUrl() {
    return endpointUrl;
  }

  @Override
  public Map<String, String> getQueryParameters() {
    return queryParameters;
  }

  @Override
  public Map<String, String> getHeaders() {
    return headers;
  }

  @Override
  public IncludeArgument getInclude() {
    return include;
  }
}

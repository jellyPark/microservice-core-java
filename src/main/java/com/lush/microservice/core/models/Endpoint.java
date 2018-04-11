package com.lush.microservice.core.models;

import org.springframework.http.HttpMethod;

/**
 * Endpoint
 *
 * Endpoint information.
 *
 * @author Is
 * @author Jelly
 */
public class Endpoint {

  /**
   * Endpoint uri.
   */
  private String uri;

  /**
   * Http protocol method.
   */
  private HttpMethod method;

  /**
   *  Get Uri
   */ 
  public String getUri() {
    return uri;
  }
  
  /**
   *  Set Uri
   */
  public void setUri(String uri) {
    this.uri = uri;
  }

  /**
   *  Get Method
   */
  public HttpMethod getMethod() {
    return method;
  }

  /**
   *  Set Method
   */
  public void setMethod(HttpMethod method) {
    this.method = method;
  }
}

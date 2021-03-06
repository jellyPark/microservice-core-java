package com.lush.microservice.core.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

/**
 * Class for http protocol util.
 *
 * @author Is
 * @author Jelly
 */
@Component
public class HttpUtil {

  /**
   * Get http headers.
   *
   * @return HttpHeaders
   */
  public HttpHeaders getResponseHeaders() {
    HttpHeaders responseHeaders = new HttpHeaders();
    responseHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);

    return responseHeaders;
  }
}

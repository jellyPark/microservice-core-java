package com.lush.microservice.core.utils;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

/**
 * Class for application utils.
 *
 * @author Is
 * @author Jelly
 */
@Component
public class Utils {

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

  /**
   * copyNonNullProperties
   * 
   * Use for patch mapping. Make sure to save only the new data compared to the previous data.
   * 
   * @param src
   * @param target
   */
  public static void copyNonNullProperties(Object src, Object target) {
    BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
  }

  public static String[] getNullPropertyNames(Object source) {
    final BeanWrapper src = new BeanWrapperImpl(source);
    java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

    Set<String> emptyNames = new HashSet<String>();
    for (java.beans.PropertyDescriptor pd : pds) {
      Object srcValue = src.getPropertyValue(pd.getName());
      if (srcValue == null)
        emptyNames.add(pd.getName());
    }
    String[] result = new String[emptyNames.size()];
    return emptyNames.toArray(result);
  }
}

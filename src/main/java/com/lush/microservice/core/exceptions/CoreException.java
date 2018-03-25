package com.lush.microservice.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import com.lush.microservice.core.enums.ResponseStatusType;

/**
 * Core Exception(Common)
 * 
 * @author Jelly
 *
 */
@Component
public class CoreException extends RuntimeException {

  /**
   * Create default serialVersionUID.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Exceptoin status
   */
  private final String status;

  /**
   * Exceptoin code
   */
  private final Integer code;

  /**
   * Exceptoin message
   */
  private final String message;

  /**
   * The default creator. (using default code and message)
   * 
   * @param exceptionType
   */
  public CoreException(ExceptionType exceptionType) {
    this.status = ResponseStatusType.FAIL.getStatus();
    this.code = HttpStatus.INTERNAL_SERVER_ERROR.value();
    this.message = exceptionType.getMassage();
  }

  /**
   * The default creator. (User Created)
   * 
   * @param code
   * @param handlerMessage
   */
  public CoreException(Integer code, String handlerMessage) {
    this.status = ResponseStatusType.FAIL.getStatus();
    this.code = HttpStatus.INTERNAL_SERVER_ERROR.value();
    this.message = handlerMessage;
  }

  public String getStatus() {
    return status;
  }

  public Integer getCode() {
    return code;
  }

  @Override
  public String getMessage() {
    return message;
  }
}

package com.lush.microservice.core.exceptions;

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
  private ResponseStatusType status;

  /**
   * Exceptoin message
   */
  private String message;

  /**
   * The default creator. (using default code and message)
   * 
   * @param exceptionType
   */
  public CoreException(ExceptionType exceptionType) {
    this.status = ResponseStatusType.FAIL;
    this.message = exceptionType.getMassage();
  }

  /**
   * The default creator. (User Created)
   * 
   * @param code
   * @param handlerMessage
   */
  public CoreException(int code, String handlerMessage) {
    this.status = ResponseStatusType.FAIL;
    this.message = handlerMessage;
  }

  public ResponseStatusType getStatus() {
    return status;
  }

  public void setStatus(ResponseStatusType status) {
    this.status = status;
  }

  @Override
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}

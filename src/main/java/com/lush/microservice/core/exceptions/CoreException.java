package com.lush.microservice.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import com.lush.microservice.core.enums.ExceptionType;
import com.lush.microservice.core.enums.ResponseStatusType;

/**
 * Core Exception(Common)
 * 
 * @author Jelly
 * @author IS
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
  private String status;

  /**
   * Exceptoin code
   */
  private Integer code;

  /**
   * Exceptoin message
   */
  private String message;

  /**
   * The default creator. (using default code and message)
   * 
   * @param exceptionType
   */
  public CoreException() {
    this.status = ResponseStatusType.FAIL.getStatus();
    this.code = HttpStatus.INTERNAL_SERVER_ERROR.value();
    this.message = "Internal server exception";
  }

  /**
   * The default creator. (User Created)
   * 
   * @param code
   * @param handlerMessage
   */
  public CoreException(Integer code, String handlerMessage) {
    this.status = ResponseStatusType.FAIL.getStatus();
    this.code = code;
    this.message = handlerMessage;
  }

  /**
   * set Default exception message
   * 
   * @param exceptionType
   */
  public CoreException setCommonExceptoin(ExceptionType exceptionType) {
    CoreException coreException =
        new CoreException(exceptionType.getCode(), exceptionType.getMassage());
    return coreException;
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

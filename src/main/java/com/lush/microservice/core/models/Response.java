package com.lush.microservice.core.models;

import com.lush.microservice.core.enums.ResponseStatusType;
import com.lush.microservice.core.enums.ResponseStatusType;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * Response
 *
 * Response object to user requests.
 *
 * @author Is
 * @author Jelly
 */
@Component
public class Response {

  /**
   * Response status.
   * use ResponseStatusType
   */
  private ResponseStatusType status;

  /**
   * Response code.
   * use HttpStatus value
   */
  private Integer code;

  /**
   * Response message.
   */
  private String message;

  /**
   * Response data.
   */
  private Object data;

  /**
   * Default constructor.
   */
  public Response () {
    this.status = ResponseStatusType.OK;
    this.code = HttpStatus.OK.value();
    this.message = "success";
    this.data = "";
  }

  /**
   * Constructor.
   *
   * @param status
   * @param code
   * @param message
   */
  public Response(ResponseStatusType status, Integer code, String message) {
    this.status = status;
    this.code = code;
    this.message = message;
    this.data = "";
  }

  /**
   * Constructor.
   *
   * @param status
   * @param code
   * @param message
   * @param data
   */
  public Response(ResponseStatusType status, Integer code, String message, Object data) {
    this.status = status;
    this.code = code;
    this.message = message;
    this.data = data;
  }

  /**
   * Get status
   */
  public ResponseStatusType getStatus() {
    return status;
  }

  /**
   * Set status
   */
  public void setStatus(ResponseStatusType status) {
    this.status = status;
  }

  /**
   * Get code
   */
  public Integer getCode() {
    return code;
  }

  /**
   * Set code
   */
  public void setCode(Integer code) {
    this.code = code;
  }
  
  /**
   * Get message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Set message
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Get Object Data
   */
  public Object getData() {
    return data;
  }

  /**
   * Set Objcet Data
   */
  public void setData(Object data) {
    this.data = data;
  }
}

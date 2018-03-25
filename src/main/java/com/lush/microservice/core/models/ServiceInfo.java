package com.lush.microservice.core.models;

import java.util.List;

/**
 * ServiceInfo
 *
 * Response object to hold endpoint information.
 *
 * @author Is
 * @author Jelly
 */
public class ServiceInfo {

  /**
   * Service name of microservice.
   */
  private String service_name;

  /**
   * Service type of microservice.
   */
  private String service_type;

  /**
   * Service scope of microservice.
   */
  private String service_scope;

  /**
   * Service version of microservice.
   */
  private String service_version;

  /**
   * Endpoint list of microservice.
   */
  private List<Endpoint> endpoints;

  // Getter and Setter.
  public String getService_name() {
    return service_name;
  }

  public void setService_name(String service_name) {
    this.service_name = service_name;
  }

  public String getService_type() {
    return service_type;
  }

  public void setService_type(String service_type) {
    this.service_type = service_type;
  }

  public String getService_scope() {
    return service_scope;
  }

  public void setService_scope(String service_scope) {
    this.service_scope = service_scope;
  }

  public String getService_version() {
    return service_version;
  }

  public void setService_version(String service_version) {
    this.service_version = service_version;
  }

  public List<Endpoint> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<Endpoint> endpoints) {
    this.endpoints = endpoints;
  }
}

package com.vass.jos.backend.web.rest;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class InternalServiceException extends RuntimeException {
  private String msg;
  private String code;
  private String detail;
  private HttpStatus httpStatus;

  public InternalServiceException(String msg, String code, String detail, HttpStatus httpStatus) {
    super( msg );

    this.msg = msg;
    this.code = code;
    this.detail = detail;
    this.httpStatus = httpStatus;
  }
}
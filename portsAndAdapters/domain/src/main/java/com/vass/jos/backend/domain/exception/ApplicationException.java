package com.vass.jos.backend.domain.exception;

import lombok.Getter;

@Getter
public class ApplicationException extends RuntimeException {

  private final int code;

  public ApplicationException(final int errorCode, final String message) {
    super(message);
    this.code = errorCode;
  }

  protected ApplicationException(final int errorCode, final String message, final Throwable e) {
    super(message, e);
    this.code = errorCode;
  }

}

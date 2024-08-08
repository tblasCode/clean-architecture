package com.vass.jos.backend.presentation.exception;

import com.vass.jos.backend.presentation.apirest.model.ApiError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(InternalServiceException.class)
    public ResponseEntity<ApiError> handleGlobalException(InternalServiceException ex) {

        ApiError apiError = new ApiError();
        apiError.setStatus(ex.getHttpStatus().value());
        apiError.setDetail(ex.getCode());
        apiError.setMessage(ex.getMessage());
        apiError.setTitle("Internal Server Error");
        apiError.setType("https://httpstatuses.com/500");

        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(httpHeaders).body(apiError);
    }
}

package com.learning.boot.requestInterceptor.handler;

import com.learning.boot.requestInterceptor.exception.InvalidFieldException;
import com.learning.boot.requestInterceptor.exception.InvalidHeaderFieldException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyRequestHandler {

    @ExceptionHandler
    public String handleInvalidFieldException(InvalidFieldException exception){
    return exception.getMessage();
    }

    @ExceptionHandler
    public ResponseEntity<String> handleInvalidHeaderFieldException(InvalidHeaderFieldException exception){
       return new ResponseEntity<>(exception.getMessage(), HttpStatus.PRECONDITION_FAILED) ;
    }
}

package com.learning.boot.requestInterceptor.exception;

public class InvalidFieldException extends RuntimeException {



    public InvalidFieldException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidFieldException(String last_name_is_required_field) {
    }



}

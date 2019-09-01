package com.learning.boot.requestInterceptor.exception;

public class InvalidHeaderFieldException extends RuntimeException {

    private String  message;

    public InvalidHeaderFieldException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

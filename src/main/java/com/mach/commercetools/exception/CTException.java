package com.mach.commercetools.exception;

public class CTException extends RuntimeException {

    public CTException() {}

    public CTException(String message) {
        super(message);
    }

    public CTException(String message, Throwable cause) {
        super(message, cause);
    }

    public CTException(Throwable cause) {
        super(cause);
    }
}

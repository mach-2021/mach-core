package com.mach.core.exception;


import org.springframework.http.HttpStatus;

public class EmailExistException extends BaseException {

    private static final HttpStatus HTTP_STATUS = HttpStatus.CONFLICT;

    public EmailExistException(final String message, String code) {
        super(message, code);
    }

    @Override
    public HttpStatus getStatus() {
        return HTTP_STATUS;
    }
}

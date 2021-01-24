package com.mach.core.exception;

import org.springframework.http.HttpStatus;

public class UnprocessableEntityException extends BaseException {

    private static final HttpStatus HTTP_STATUS = HttpStatus.UNPROCESSABLE_ENTITY;

    public UnprocessableEntityException(final String message, final String code) {
        super(message, code);
    }

    @Override
    public HttpStatus getStatus() {
        return HTTP_STATUS;
    }

}

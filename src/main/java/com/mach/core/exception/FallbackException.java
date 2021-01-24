package com.mach.core.exception;

import org.springframework.http.HttpStatus;

public class FallbackException extends BaseException {

    private static final HttpStatus HTTP_STATUS = HttpStatus.SERVICE_UNAVAILABLE;

    public FallbackException(final String message, final String code) {
        super(message, code);
    }

    @Override
    public HttpStatus getStatus() {
        return HTTP_STATUS;
    }
}

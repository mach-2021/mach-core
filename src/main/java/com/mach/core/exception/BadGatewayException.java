package com.mach.core.exception;

import org.springframework.http.HttpStatus;

public class BadGatewayException extends BaseException {

    private static final HttpStatus HTTP_STATUS = HttpStatus.BAD_GATEWAY;

    public BadGatewayException(final String message, final String code) {
        super(message, code);
    }

    @Override
    public HttpStatus getStatus() {
        return HTTP_STATUS;
    }
}

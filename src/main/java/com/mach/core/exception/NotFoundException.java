package com.mach.core.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends BaseException {

    private static final HttpStatus HTTP_STATUS = HttpStatus.NOT_FOUND;

    public NotFoundException(final String message, final String code) {
        super(message, code);
    }

    @Override
    public HttpStatus getStatus() {
        return HTTP_STATUS;
    }

}

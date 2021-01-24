package com.mach.core.exception;

import org.springframework.http.HttpStatus;

public class FeignApiException extends BaseException {

    private final HttpStatus status;

    public FeignApiException(final String message, final String code, final int status) {
        super(message, code);
        this.status = HttpStatus.valueOf(status);
    }

    @Override
    public HttpStatus getStatus() {
        return status;
    }
}

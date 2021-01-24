package com.mach.core.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BadRequestException extends BaseException {

    private static final HttpStatus HTTP_STATUS = HttpStatus.BAD_REQUEST;

    public BadRequestException(final String message, final String code) {
        super(message, code);
    }

    @Override
    public HttpStatus getStatus() {
        return HTTP_STATUS;
    }
}

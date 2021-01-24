package com.mach.core.exception;

import com.mach.core.exception.model.FeignErrorModel;
import org.springframework.http.HttpStatus;

public class BaseException extends RuntimeException implements StatusException {

    private static final HttpStatus HTTP_STATUS = HttpStatus.INTERNAL_SERVER_ERROR;
    private final FeignErrorModel apiErrorModel;

    public BaseException(String message, String code) {
        super(message);
        this.apiErrorModel = new FeignErrorModel(message, code);
    }

    public BaseException(String message, String code, Throwable cause) {
        super(message, cause);
        this.apiErrorModel = new FeignErrorModel(message, code);
    }

    @Override
    public HttpStatus getStatus() {
        return HTTP_STATUS;
    }

    public FeignErrorModel getModel() {
        return apiErrorModel;
    }
}

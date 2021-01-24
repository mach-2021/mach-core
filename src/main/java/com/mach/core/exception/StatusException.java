package com.mach.core.exception;

import org.springframework.http.HttpStatus;

public interface StatusException {

    HttpStatus getStatus();
}

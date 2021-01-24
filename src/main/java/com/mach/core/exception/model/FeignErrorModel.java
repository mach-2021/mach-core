package com.mach.core.exception.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FeignErrorModel extends BaseErrorModel {

    private String message;
    private String code;

    public FeignErrorModel(final String message, final String code) {
        this.message = message;
        this.code = code;
    }
}

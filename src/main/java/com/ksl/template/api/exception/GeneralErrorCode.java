package com.ksl.template.api.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum GeneralErrorCode implements ErrorCode {
    INTERNAL_SERVER_ERROR("001", "Internal Server Error"),
    BAD_REQUEST("002", "Bad Request"),
    NOT_FOUND("003", "Resource Not Found"),
    VALIDATION_ERROR("004", "Validation Error");

    private final String code;
    private final String message;

    @Override
    public String getCode() {
        return ComponentCode.TEMPLATE.getCode() + "-" + FeatureCode.GENERAL.getCode() + "-" + code;
    }
}

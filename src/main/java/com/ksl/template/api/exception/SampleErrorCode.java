package com.ksl.template.api.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SampleErrorCode implements ErrorCode {
    SAMPLE_NOT_FOUND("001", "Sample not found"),
    SAMPLE_ALREADY_EXISTS("002", "Sample already exists");

    private final String code;
    private final String message;

    @Override
    public String getCode() {
        return ComponentCode.TEMPLATE.getCode() + "-" + FeatureCode.SAMPLE.getCode() + "-" + code;
    }
}

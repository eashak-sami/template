package com.ksl.template.api.exception;

public class SampleException extends BaseException {
    public SampleException(ErrorCode errorCode) {
        super(errorCode);
    }

    public SampleException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }
}

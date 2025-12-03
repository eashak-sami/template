package com.ksl.template.api.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FeatureCode {
    GENERAL("000"), // General/Common errors
    SAMPLE("001"); // Sample feature errors

    private final String code;
}

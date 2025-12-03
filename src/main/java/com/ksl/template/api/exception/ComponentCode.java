package com.ksl.template.api.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ComponentCode {
    TEMPLATE("TMP");

    private final String code;
}

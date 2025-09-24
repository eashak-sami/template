package com.ksl.template.application.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum Status {
    INACTIVE("00"),
    ACTIVE("10"),
    SUSPENDED("20"),
    TERMINATED("30");

    private static final Map<String, Status> MAP_BY_VALUE = new HashMap<>();
    private static final Map<String, Status> MAP_BY_NAME = new HashMap<>();

    static {
        for (Status code : Status.values()) {
            MAP_BY_VALUE.put(code.value, code);
            MAP_BY_NAME.put(code.name(), code);
        }
    }

    final String value;

    Status(String value) {
        this.value = value;
    }

    public static Status getByValue(String value) {
        return value == null ? null : MAP_BY_VALUE.get(value);
    }

    public static Status getByName(String name) {
        return name == null ? null : MAP_BY_NAME.get(name);
    }

    @JsonValue
    public String getVal() {
        return this.value;
    }
}

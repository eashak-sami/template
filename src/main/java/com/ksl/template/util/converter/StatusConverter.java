package com.ksl.template.util.converter;

import com.ksl.template.application.enums.Status;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class StatusConverter implements AttributeConverter<Status, String> {

    @Override
    public String convertToDatabaseColumn(Status status) {
        return status == null ? null : status.getVal();
    }

    @Override
    public Status convertToEntityAttribute(String dbData) {
        return Status.getByValue(dbData);
    }
}

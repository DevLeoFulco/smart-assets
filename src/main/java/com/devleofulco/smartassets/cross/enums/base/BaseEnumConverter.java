package com.devleofulco.smartassets.cross.enums.base;

import jakarta.persistence.AttributeConverter;

import java.util.Arrays;

public abstract class BaseEnumConverter<E extends Enum<E>& BaseEnum<T>, T> implements AttributeConverter<E, T> {
    private final Class<E> enumClass;

    protected BaseEnumConverter(Class<E> enumClass) {
        this.enumClass = enumClass;
    }

    @Override
    public T convertToDatabaseColumn(E enumValue) {
        return enumValue == null ? null : enumValue.getId();
    }

    @Override
    public E convertToEntityAttribute(T id) {
        if (id == null) return null;

        return Arrays.stream(enumClass.getEnumConstants())
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id + " for enum " + enumClass.getSimpleName()));
    }
}

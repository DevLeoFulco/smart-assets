package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.AssetStatusEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class AssetStatusConverter implements AttributeConverter<AssetStatusEnum, Long> {
    @Override
    public Long convertToDatabaseColumn(AssetStatusEnum enumObj) {
        if (enumObj == null) {
            return null;
        }
        return enumObj.getId();
    }

    @Override
    public AssetStatusEnum convertToEntityAttribute(Long id) {
        if (id == null) {
            return null;
        }

        return Stream.of(AssetStatusEnum.values())
                .filter(o -> o.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid AssetStatusEnum id: " + id));
    }
}

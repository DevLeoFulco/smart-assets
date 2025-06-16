package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.AssetTypeEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class AssetTypeConverter implements AttributeConverter<AssetTypeEnum, Long> {
    @Override
    public Long convertToDatabaseColumn(AssetTypeEnum enumObj) {
        if (enumObj == null) {
            return null;
        }
        return enumObj.getId();
    }

    @Override
    public AssetTypeEnum convertToEntityAttribute(Long id) {
        if (id == null) {
            return null;
        }

        return Stream.of(AssetTypeEnum.values())
                .filter(o -> o.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid AssetTypeEnum id: " + id));
    }
}

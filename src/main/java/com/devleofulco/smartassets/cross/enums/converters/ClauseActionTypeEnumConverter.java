package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.ClauseActionTypeEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ClauseActionTypeEnumConverter implements AttributeConverter<ClauseActionTypeEnum, Long> {
    @Override
    public Long convertToDatabaseColumn(ClauseActionTypeEnum attribute) {
        return attribute != null ? attribute.getId() : null;
    }

    @Override
    public ClauseActionTypeEnum convertToEntityAttribute(Long dbData) {
        return dbData != null ? ClauseActionTypeEnum.fromId(dbData) : null;
    }
}

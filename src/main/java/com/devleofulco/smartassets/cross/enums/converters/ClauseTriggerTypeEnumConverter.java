package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.ClauseTriggerTypeEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ClauseTriggerTypeEnumConverter implements AttributeConverter<ClauseTriggerTypeEnum, Long> {
    @Override
    public Long convertToDatabaseColumn(ClauseTriggerTypeEnum enumObj) {
        if (enumObj == null) {
            return null;
        }
        return enumObj.getId();
    }

    @Override
    public ClauseTriggerTypeEnum convertToEntityAttribute(Long id) {
        if (id == null) {
            return null;
        }
        return ClauseTriggerTypeEnum.fromId(id);
    }
}

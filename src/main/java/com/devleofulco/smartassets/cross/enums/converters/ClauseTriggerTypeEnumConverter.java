package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.ClauseTriggerTypeEnum;
import com.devleofulco.smartassets.cross.enums.base.BaseEnumConverter;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ClauseTriggerTypeEnumConverter extends BaseEnumConverter<ClauseTriggerTypeEnum, Long> {
    public ClauseTriggerTypeEnumConverter() {
        super(ClauseTriggerTypeEnum.class);
    }
}

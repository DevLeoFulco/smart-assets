package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.ClauseActionTypeEnum;
import com.devleofulco.smartassets.cross.enums.base.BaseEnumConverter;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ClauseActionTypeEnumConverter extends BaseEnumConverter<ClauseActionTypeEnum, Long> {
    public ClauseActionTypeEnumConverter() {
        super(ClauseActionTypeEnum.class);
    }
}

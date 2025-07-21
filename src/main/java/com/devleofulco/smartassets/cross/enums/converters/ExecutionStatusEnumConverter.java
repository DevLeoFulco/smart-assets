package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.ExecutionStatusEnum;
import com.devleofulco.smartassets.cross.enums.base.BaseEnumConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ExecutionStatusEnumConverter extends BaseEnumConverter<ExecutionStatusEnum, Long> {

    public ExecutionStatusEnumConverter() {
        super(ExecutionStatusEnum.class);
    }
}

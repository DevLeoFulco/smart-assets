package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.ContractStatusEnum;
import com.devleofulco.smartassets.cross.enums.base.BaseEnumConverter;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class ContractStatusConverter extends BaseEnumConverter<ContractStatusEnum, Long> {
    public ContractStatusConverter() {
        super(ContractStatusEnum.class);
    }
}

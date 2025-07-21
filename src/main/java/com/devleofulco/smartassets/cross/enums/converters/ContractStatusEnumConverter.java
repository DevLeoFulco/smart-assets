package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.ContractStatusEnum;
import com.devleofulco.smartassets.cross.enums.base.BaseEnumConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ContractStatusEnumConverter extends BaseEnumConverter<ContractStatusEnum, Long> {
    public ContractStatusEnumConverter() {
        super(ContractStatusEnum.class);
    }
}

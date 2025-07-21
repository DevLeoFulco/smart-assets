package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.VotingTypeEnum;
import com.devleofulco.smartassets.cross.enums.base.BaseEnumConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class VotingTypeEnumConverter extends BaseEnumConverter<VotingTypeEnum,Long> {

    public VotingTypeEnumConverter() {
        super(VotingTypeEnum.class);
    }
}

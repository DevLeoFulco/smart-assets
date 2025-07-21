package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.VotingResultEnum;
import com.devleofulco.smartassets.cross.enums.base.BaseEnumConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class VotingResultEnumConverter extends BaseEnumConverter<VotingResultEnum,Long> {
    public VotingResultEnumConverter() {
        super(VotingResultEnum.class);
    }
}

package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.TokenTypeEnum;
import com.devleofulco.smartassets.cross.enums.base.BaseEnumConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class TokenTypeEnumConverter extends BaseEnumConverter<TokenTypeEnum,Long> {

    public TokenTypeEnumConverter() {
        super(TokenTypeEnum.class);
    }
}

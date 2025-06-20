package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.TipoPartyEnum;
import com.devleofulco.smartassets.cross.enums.base.BaseEnumConverter;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class TipoPartyEnumConverter extends BaseEnumConverter<TipoPartyEnum, Long> {
    public TipoPartyEnumConverter() {
        super(TipoPartyEnum.class);
    }

}

package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.TipoPartyEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class TipoPartyEnumConverter implements AttributeConverter<TipoPartyEnum, Long> {
    @Override
    public Long convertToDatabaseColumn(TipoPartyEnum enumObj) {
        if (enumObj == null) {
            return null;
        }
        return enumObj.getId();
    }

    @Override
    public TipoPartyEnum convertToEntityAttribute(Long id) {
        if (id == null) {
            return null;
        }
        return TipoPartyEnum.fromId(id);
    }
}

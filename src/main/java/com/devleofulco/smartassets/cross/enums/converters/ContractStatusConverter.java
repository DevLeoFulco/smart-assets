package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.ContractStatusEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class ContractStatusConverter implements AttributeConverter<ContractStatusEnum, Long> {
    @Override
    public Long convertToDatabaseColumn(ContractStatusEnum enumObj) {
        if (enumObj == null) {
            return null;
        }
        return enumObj.getId();
    }

    @Override
    public ContractStatusEnum convertToEntityAttribute(Long id) {
        if (id == null) {
            return null;
        }

        return Stream.of(ContractStatusEnum.values())
                .filter(o -> o.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid ContractStatusEnum id: " + id));
    }
}

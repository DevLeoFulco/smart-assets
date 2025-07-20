package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.AssetStatusEnum;
import com.devleofulco.smartassets.cross.enums.base.BaseEnumConverter;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class AssetStatusConverter extends BaseEnumConverter<AssetStatusEnum, Long> {
    public AssetStatusConverter() {
        super(AssetStatusEnum.class);
    }
}

package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.AssetStatusEnum;
import com.devleofulco.smartassets.cross.enums.base.BaseEnumConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class AssetStatusEnumConverter extends BaseEnumConverter<AssetStatusEnum, Long> {
    public AssetStatusEnumConverter() {
        super(AssetStatusEnum.class);
    }
}

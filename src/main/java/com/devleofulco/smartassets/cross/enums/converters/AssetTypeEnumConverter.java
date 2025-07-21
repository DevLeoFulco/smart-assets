package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.AssetTypeEnum;
import com.devleofulco.smartassets.cross.enums.base.BaseEnumConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class AssetTypeEnumConverter extends BaseEnumConverter<AssetTypeEnum, Long> {
    public AssetTypeEnumConverter() {

        super(AssetTypeEnum.class);
    }

}

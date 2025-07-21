package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.DocumentTypeEnum;
import com.devleofulco.smartassets.cross.enums.base.BaseEnumConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class DocumentTypeEnumConverter extends BaseEnumConverter<DocumentTypeEnum, Long> {

    public DocumentTypeEnumConverter() {
        super(DocumentTypeEnum.class);
    }
}

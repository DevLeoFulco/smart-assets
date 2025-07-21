package com.devleofulco.smartassets.cross.enums.converters;

import com.devleofulco.smartassets.cross.enums.UserRoleEnum;
import com.devleofulco.smartassets.cross.enums.base.BaseEnumConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class UserRoleEnumConverter extends BaseEnumConverter<UserRoleEnum, Long> {

    public UserRoleEnumConverter() {
        super(UserRoleEnum.class);
    }
}

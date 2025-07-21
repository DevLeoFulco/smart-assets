package com.devleofulco.smartassets.domain.model;

import com.devleofulco.smartassets.cross.enums.UserRoleEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
    private UserRoleEnum role;
}

package com.devleofulco.smartassets.cross.enums;

import com.devleofulco.smartassets.cross.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserRoleEnum implements BaseEnum<Long> {
    ADMIN(1L, "Administrador"),
    USER(2L, "Usuário"),
    GUEST(3L, "Convidado"),
    OWNER(4L, "Proprietário"),
    MAINTAINER(5L, "Mantenedor"),
    AUDITOR(6L, "Auditor");


    private final Long id;
    private final String descricao;

    UserRoleEnum(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return descricao;
    }
}

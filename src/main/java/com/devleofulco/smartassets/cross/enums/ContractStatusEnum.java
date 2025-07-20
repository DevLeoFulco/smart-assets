package com.devleofulco.smartassets.cross.enums;

import com.devleofulco.smartassets.cross.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ContractStatusEnum implements BaseEnum<Long> {
    DRAFT(1L, "Rascunho"),
    ACTIVE(2L, "Ativo"),
    FULFILLED(3L, "Cumprido"),
    TERMINATED(4L, "Terminado"),
    DISPUTED(5L, "Em Disputa");

    private final Long id;
    private final String descricao;

    ContractStatusEnum(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return "";
    }
}

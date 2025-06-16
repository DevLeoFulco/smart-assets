package com.devleofulco.smartassets.cross.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ContractStatusEnum {
    DRAFT(1L, "Rascunho"),
    ACTIVE(2L, "Ativo"),
    FULFILLED(3L, "Cumprido"),
    TERMINATED(4L, "Terminado"),
    DISPUTED(5L, "Em Disputa");

    private final Long id;
    private final String descricao;

    public static ContractStatusEnum fromId(Long id) {
        for (ContractStatusEnum status : values()) {
            if (status.getId().equals(id)) {
                return status;
            }
        }
        return null;
    }
}

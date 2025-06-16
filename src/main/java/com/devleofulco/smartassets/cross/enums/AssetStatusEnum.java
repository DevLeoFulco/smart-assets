package com.devleofulco.smartassets.cross.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AssetStatusEnum {
    ACTIVE(1L, "Ativo"),
    ARCHIVED(2L, "Arquivado"),
    UNDER_MAINTENANCE(3L, "Em Manutenção"),
    DISPOSED(4L, "Descartado");

    private final Long id;
    private final String descricao;

    public static AssetStatusEnum fromId(Long id) {
        for (AssetStatusEnum status : values()) {
            if (status.getId().equals(id)) {
                return status;
            }
        }
        return null;
    }
}

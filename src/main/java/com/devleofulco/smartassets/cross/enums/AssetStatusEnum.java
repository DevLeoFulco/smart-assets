package com.devleofulco.smartassets.cross.enums;

import com.devleofulco.smartassets.cross.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AssetStatusEnum implements BaseEnum<Long> {
    ACTIVE(1L, "Ativo"),
    ARCHIVED(2L, "Arquivado"),
    UNDER_MAINTENANCE(3L, "Em Manutenção"),
    DISPOSED(4L, "Descartado");

    private final Long id;
    private final String descricao;

    @Override
    public String getDescription() {
        return "";
    }
}

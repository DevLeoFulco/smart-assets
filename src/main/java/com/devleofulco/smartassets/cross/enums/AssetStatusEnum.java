package com.devleofulco.smartassets.cross.enums;

import com.devleofulco.smartassets.cross.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AssetStatusEnum implements BaseEnum<Long> {
    ACTIVE(1L, "Ativo"),
    ARCHIVED(2L, "Arquivado"),
    TOKENIZED(3L, "Tokenizado"),
    UNDER_MAINTENANCE(4L, "Em Manutenção"),
    DISPOSED(5L, "Descartado");

    private final Long id;
    private final String descricao;

    AssetStatusEnum(Long id, String descricao) {
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

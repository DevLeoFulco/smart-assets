package com.devleofulco.smartassets.cross.enums;

import com.devleofulco.smartassets.cross.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoPartyEnum implements BaseEnum<Long> {
    INDIVIDUAL(1L, "Pessoa Física"),
    COMPANHIA(2L, "Pessoa Jurídica"),
    GOVERNAMENTAL(3L, "Orgão Público"),
    NON_PROFIT(4L, "Organização Sem Fins Lucrativos");

    private Long id;
    private String descricao;

    TipoPartyEnum(Long id, String descricao) {
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

package com.devleofulco.smartassets.cross.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoPartyEnum {
    INDIVIDUAL(1L, "Pessoa Física"),
    COMPANHIA(2L, "Pessoa Jurídica"),
    GOVERNAMENTAL(3L, "Orgão Público"),
    NON_PROFIT(4L, "Organização Sem Fins Lucrativos");

    private Long id;
    private String descricao;

    public static TipoPartyEnum fromId(Long id) {
        for (TipoPartyEnum type : values()) {
            if (type.getId().equals(id)) {
                return type;
            }
        }
        return null;
    }
}

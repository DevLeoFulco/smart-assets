package com.devleofulco.smartassets.cross.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClauseActionTypeEnum {
    NOTOFICATION(1L, "ENviar Notificação"),
    PAYMENT(2L, "Efetuar Pagamento"),
    PENALTY(3L, "Aplicar Multa"),
    TERMINATION(4L, "Encerrar Contrato"),
    CUSTOM(5L, "Ação Personalizada");

    private final Long id;
    private final String descricao;

    public static ClauseActionTypeEnum fromId(Long id) {
        for (ClauseActionTypeEnum type : values()) {
            if (type.getId().equals(id)) {
                return type;
            }
        }
        return null;
    }
}

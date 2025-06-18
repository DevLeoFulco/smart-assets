package com.devleofulco.smartassets.cross.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClauseTriggerTypeEnum {
    TEMPORAL(1L, "Disparo Temporal"),
    EVENT(2L, "Disparo de Evento"),
    CONDITIONAL(3L, "Disparo Condicional"),
    MANUAL(4L, "Disparo Manual");

    private final Long id;
    private final String descricao;

    public static ClauseTriggerTypeEnum fromId(Long id) {
        for (ClauseTriggerTypeEnum type : values()) {
            if (type.getId().equals(id)) {
                return type;
            }
        }
        return null;
    }
}

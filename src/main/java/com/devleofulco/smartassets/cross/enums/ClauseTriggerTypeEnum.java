package com.devleofulco.smartassets.cross.enums;

import com.devleofulco.smartassets.cross.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClauseTriggerTypeEnum implements BaseEnum<Long> {
    TEMPORAL(1L, "Disparo Temporal"),
    EVENT(2L, "Disparo de Evento"),
    CONDITIONAL(3L, "Disparo Condicional"),
    MANUAL(4L, "Disparo Manual");

    private final Long id;
    private final String descricao;

    @Override
    public String getDescription() {
        return "";
    }
}

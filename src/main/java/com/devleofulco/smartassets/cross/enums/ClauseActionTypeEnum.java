package com.devleofulco.smartassets.cross.enums;

import com.devleofulco.smartassets.cross.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClauseActionTypeEnum implements BaseEnum<Long> {
    NOTOFICATION(1L, "ENviar Notificação"),
    PAYMENT(2L, "Efetuar Pagamento"),
    PENALTY(3L, "Aplicar Multa"),
    TERMINATION(4L, "Encerrar Contrato"),
    CUSTOM(5L, "Ação Personalizada");

    private final Long id;
    private final String descricao;

    ClauseActionTypeEnum(Long id, String descricao) {
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

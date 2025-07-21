package com.devleofulco.smartassets.cross.enums;

import com.devleofulco.smartassets.cross.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExecutionStatusEnum implements BaseEnum<Long> {
    PENDING(1L, "Pendente"),
    IN_PROGRESS(2L, "Em Progresso"),
    COMPLETED(3L, "Concluído"),
    FAILED(4L, "Falhou"),
    CANCELLED(5L, "Cancelado");

    private final Long id;
    private final String descricao;

    ExecutionStatusEnum(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return descricao;
    }
}

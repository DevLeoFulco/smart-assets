package com.devleofulco.smartassets.cross.enums;

import com.devleofulco.smartassets.cross.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VotingResultEnum implements BaseEnum<Long> {
    APPROVED(1L, "Aprovado"),
    REJECTED(2L, "Rejeitado"),
    PENDING(3L, "Pendente"),
    TIED(4L, "Empatado");

    private final Long id;
    private final String descricao;

    VotingResultEnum(Long id, String descricao) {
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

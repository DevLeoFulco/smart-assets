package com.devleofulco.smartassets.cross.enums;

import com.devleofulco.smartassets.cross.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TokenTypeEnum implements BaseEnum<Long> {
    UTILITY(1L, "Utilidade"),
    SECURITY(2L, "Segurança"),
    ASSET_BACKED(3L, "Lastreado em Ativos"),
    GOVERNANCE(4L, "Governança"),
    NON_FUNGIBLE(5L, "Não Fungível"),
    REWARD(6L, "Recompensa"),
    STABLECOIN(7L, "Stablecoin"),
    NFT(8L, "NFT"),
    OTHER(9L, "Outro");

    private final Long id;
    private final String descricao;

    TokenTypeEnum(Long id, String descricao) {
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

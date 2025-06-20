package com.devleofulco.smartassets.cross.enums;

import com.devleofulco.smartassets.cross.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AssetTypeEnum implements BaseEnum<Long> {
    EQUIPMENTO(1L, "Equipamento"),
    IMOVEL_DIGITAL(2L, "Imóvel"),
    PROPRIEDADE_INTELECTUAL(3L, "Propriedade Intelectual"),
    VEICULO(4L, "Veículo"),
    NFC(5L, "NFCs"),
    CODIGOS_FONTE(6L, "Códigos Fonte"),
    OUTROS(99L, "Outros");

    private final Long id;
    private final String descricao;

    @Override
    public String getDescription() {
        return "";
    }
}

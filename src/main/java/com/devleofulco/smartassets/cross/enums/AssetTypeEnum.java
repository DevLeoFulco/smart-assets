package com.devleofulco.smartassets.cross.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AssetTypeEnum {
    EQUIPMENTO(1L, "Equipamento"),
    IMOVEL_DIGITAL(2L, "Imóvel"),
    PROPRIEDADE_INTELECTUAL(3L, "Propriedade Intelectual"),
    VEICULO(4L, "Veículo"),
    NFC(5L, "NFCs"),
    CODIGOS_FONTE(6L, "Códigos Fonte"),
    OUTROS(99L, "Outros")
    ;

    private final Long id;
    private final String descricao;

    public static AssetTypeEnum fromId(Long id) {
        for (AssetTypeEnum type : values()) {
            if (type.getId().equals(id)) {
                return type;
            }
        }
        return null;
    }
}

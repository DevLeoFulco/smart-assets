package com.devleofulco.smartassets.domain.model;


import com.devleofulco.smartassets.cross.enums.AssetStatusEnum;
import com.devleofulco.smartassets.cross.enums.AssetTypeEnum;
import com.devleofulco.smartassets.domain.model.records.AssetId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Map;


@Getter
@Setter
@AllArgsConstructor
public class Asset {
    private AssetId id;
    private String nome;
    private String descricao;
    private AssetTypeEnum tipo;
    private LocalDate dataDeAquisicao;
    private Map<String, Object> metadata;
    private AssetStatusEnum status;
}
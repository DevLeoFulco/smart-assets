package com.devleofulco.smartassets.infra.jpa.entity;

import com.devleofulco.smartassets.cross.enums.AssetTypeEnum;
import com.devleofulco.smartassets.cross.enums.converters.AssetTypeConverter;
import com.devleofulco.smartassets.domain.model.records.AssetId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "assets")
public class AssetJpa {
    @Id
    private AssetId id;

    @OneToMany
    private String nome;
    @OneToMany
    private String descricao;

    @ManyToOne
    private AssetTypeEnum tipo;
}

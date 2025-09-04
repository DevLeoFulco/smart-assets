package com.devleofulco.smartassets.infra.jpa.entity;

import com.devleofulco.smartassets.cross.enums.TokenTypeEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tokenizations")
public class TokenizationJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "asset_id")
    private AssetJpa asset;

    @Column(nullable = false, length = 20)
    private String tokenSymbol;

    @Column(nullable = false)
    private Double totalSupply;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TokenTypeEnum tokenType;

    @Column(nullable = false)
    private LocalDateTime issuedAt;
}
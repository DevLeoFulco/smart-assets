package com.devleofulco.smartassets.domain.model;

import com.devleofulco.smartassets.cross.enums.TokenTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Tokenization {
    private Long id;
    private Long assetId;
    private String tokenSymbol;
    private Double totalSupply;
    private TokenTypeEnum tokenType;
    private LocalDateTime issuedAt;
}

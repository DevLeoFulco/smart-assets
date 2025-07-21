package com.devleofulco.smartassets.cross.enums;

import com.devleofulco.smartassets.cross.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DocumentTypeEnum implements BaseEnum<Long> {
    DRAFT(1L, "Rascunho"),
    FINAL(2L, "Final"),
    AMENDMENT(3L, "Emenda"),
    ADDENDUM(4L, "Aditivo"),
    ANNEX(5L, "Anexo"),
    AGREEMENT(6L, "Acordo"),
    CONTRACT(7L, "Contrato"),
    PROPOSAL(8L, "Proposta"),
    MEMORANDUM(9L, "Memorando"),
    REPORT(10L, "Relatório"),
    SIGNED(11L, "Assinado"),
    CERTIFICATE(12L, "Certificado"),
    PROOF_OF_CONCEPT(13L, "Prova de Conceito"),
    PROOF(14L, "Prova"),
    OTHER(15L, "Outro");

    private final Long id;
    private final String description;

    DocumentTypeEnum (Long id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public Long getId() {
        return id;
    }
    @Override
    public String getDescription() {
        return description;
    }
}

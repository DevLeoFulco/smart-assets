package com.devleofulco.smartassets.domain.model.records;

import java.util.UUID;

public record ContractId(UUID value) {
    public ContractId {
        if (value == null) {
            throw new IllegalArgumentException("O valor do ID do contrato não pode ser nulo");
        }
    }

    public static ContractId generate() {
        return new ContractId(UUID.randomUUID());
    }

    public static ContractId fromString(String uuid) {
        try {
            return new ContractId(UUID.fromString(uuid));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Formato UUID inválido para ContractId", e);
        }
    }
}

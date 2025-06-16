package com.devleofulco.smartassets.domain.model.records;

import java.util.Objects;
import java.util.UUID;

public record AssetId(UUID value) {
    public AssetId {
        Objects.requireNonNull(value, "O valor do ID do ativo não pode ser nulo");
    }

    public static AssetId generate() {
        return new AssetId(UUID.randomUUID());
    }

    public static AssetId fromString(String uuid) {
        try {
            return new AssetId(UUID.fromString(uuid));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Formato UUID inválido para AssetId", e);
        }
    }
}

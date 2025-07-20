package com.devleofulco.smartassets.domain.gateway;

import com.devleofulco.smartassets.domain.model.Asset;
import com.devleofulco.smartassets.domain.model.records.AssetId;


import java.util.List;
import java.util.Optional;

public interface AssetManageDB {
    Asset save(Asset asset);
    Optional<Asset> findById(AssetId id);
    List<Asset> findAll();
    void deleteById(AssetId id);
}

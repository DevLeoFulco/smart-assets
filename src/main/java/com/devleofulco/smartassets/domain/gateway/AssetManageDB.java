package com.devleofulco.smartassets.domain.gateway;

import com.devleofulco.smartassets.domain.model.Asset;
import org.hibernate.query.Page;
import org.springframework.data.domain.Pageable;

public interface AssetManageDB {
    Asset save(Asset asset);
    Asset findById(Asset id);
    //Page<Asset>search(AssetFilter filter, Pageable pageable);
}

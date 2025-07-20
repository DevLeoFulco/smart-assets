package com.devleofulco.smartassets.infra.jpa.repository;

import com.devleofulco.smartassets.infra.jpa.entity.AssetJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AssetJpaRepository extends JpaRepository<AssetJpa, UUID> {


}

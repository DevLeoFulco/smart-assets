package com.devleofulco.smartassets.infra.jpa.entity;
import com.devleofulco.smartassets.infra.jpa.entity.ContractPartyJpa;
import com.devleofulco.smartassets.infra.jpa.entity.ContractClauseJpa;

import com.devleofulco.smartassets.cross.enums.ContractStatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "contracts")
public class ContractJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 150)
    private String titulo;

    @OneToMany(mappedBy = "contract", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ContractPartyJpa> parties;

    @OneToMany(mappedBy = "contract", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ContractClauseJpa> clauses;

    @Column(nullable = false)
    private LocalDate effectiveDate;

    @Column
    private LocalDate expirationDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ContractStatusEnum status;
}

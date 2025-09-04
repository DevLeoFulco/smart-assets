package com.devleofulco.smartassets.infra.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "contract_clauses")
public class ContractClauseJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "contract_id")
    private ContractJpa contract;

    @Column(nullable = false, length = 200)
    private String clauseTitle;

    @Column(nullable = false, length = 200)
    private String clauseText;
}

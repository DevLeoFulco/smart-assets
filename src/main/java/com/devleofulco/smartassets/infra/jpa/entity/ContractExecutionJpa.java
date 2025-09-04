package com.devleofulco.smartassets.infra.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "contract_executions")
public class ContractExecutionJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "contract_id")
    private ContractJpa contract;

    @Column(nullable = false)
    private LocalDateTime executedAt;

    @Column(length = 500)
    private String executionDetails;
}
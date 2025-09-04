package com.devleofulco.smartassets.infra.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "votes")
public class VoteJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "voting_id")
    private VotingJpa voting;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private UserJpa user;

    @Column(nullable = false)
    private Boolean approved;
}
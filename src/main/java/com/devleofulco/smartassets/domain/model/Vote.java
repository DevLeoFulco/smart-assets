package com.devleofulco.smartassets.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Vote {
    private Long id;
    private Long votingId;
    private Long userId;
    private Boolean voteYes;
}

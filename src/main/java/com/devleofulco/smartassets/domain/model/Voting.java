package com.devleofulco.smartassets.domain.model;

import com.devleofulco.smartassets.cross.enums.VotingResultEnum;
import com.devleofulco.smartassets.cross.enums.VotingTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Voting {
    private Long id;
    private Long contractClauseId;
    private VotingTypeEnum votingType;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private VotingResultEnum result;
    private List<Vote> votes;
}

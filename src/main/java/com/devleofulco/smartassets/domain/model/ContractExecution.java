package com.devleofulco.smartassets.domain.model;


import com.devleofulco.smartassets.cross.enums.ExecutionStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ContractExecution {
    private Long id;
    private Long contractId;
    private ExecutionStatusEnum status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long executedByUserId;
}

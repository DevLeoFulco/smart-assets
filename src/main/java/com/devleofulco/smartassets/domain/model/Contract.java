package com.devleofulco.smartassets.domain.model;

import com.devleofulco.smartassets.cross.enums.ContractStatusEnum;
import com.devleofulco.smartassets.domain.model.records.ContractId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Contract {
    private ContractId id;
    private String titulo;
    private List<ContractParty> parties;
    private List<ContractClause> clauses;
    private LocalDate effectiveDate;
    private LocalDate expirationDate;
    private ContractStatusEnum status;
}

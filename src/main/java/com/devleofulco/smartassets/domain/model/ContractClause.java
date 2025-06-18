package com.devleofulco.smartassets.domain.model;

import com.devleofulco.smartassets.cross.enums.ClauseActionTypeEnum;
import com.devleofulco.smartassets.cross.enums.ClauseTriggerTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ContractClause {
    private String clauseId;
    private String titulo;
    private String descricao;
    private ClauseTriggerTypeEnum tipoTrigger;
    private ClauseActionTypeEnum tipoAcao;
    private LocalDateTime triggerDate;
    private String triggerCondition;
    private boolean executed;
}

package com.devleofulco.smartassets.cross.enums;

import com.devleofulco.smartassets.cross.enums.base.BaseEnum;

public enum VotingTypeEnum implements BaseEnum<Long> {
    MULTIPLE_CHOICE(1L, "Multipla escolha"),
    YES_NO(2L, "Sim ou não"),
    RANKED_CHOICE(3L, "Escolha ranqueada"),
    OPEN_ENDED(4L, "Aberta");


    private final Long id;
    private final String description;

    VotingTypeEnum(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

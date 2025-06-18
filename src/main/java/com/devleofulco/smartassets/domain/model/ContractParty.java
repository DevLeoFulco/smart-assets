package com.devleofulco.smartassets.domain.model;

import com.devleofulco.smartassets.cross.enums.TipoPartyEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContractParty {
    private String partyId;
    private String nomeDaParty;
    private String identificador;
    private String email;
    private String assinaturaDigital;
    private TipoPartyEnum tipoParty;
}

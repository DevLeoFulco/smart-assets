package com.devleofulco.smartassets.domain.model;

import com.devleofulco.smartassets.cross.enums.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ContractDocument {
    private Long id;
    private Long contractId;
    private DocumentTypeEnum documentType;
    private String fileKey;
    private String fileName;
    private String mimeType;
    private LocalDateTime uploadedAt;
}

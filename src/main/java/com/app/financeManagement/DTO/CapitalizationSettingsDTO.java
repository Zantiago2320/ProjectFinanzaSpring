package com.app.financeManagement.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class CapitalizationSettingsDTO {
    private Long idCapitalizationSettings;
    //recordar poner el id del usuario que lo creo
    //private Long userId;
    private BigDecimal interestRate;
    private String capitalizationFrequency;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public Long getId() {
        return idCapitalizationSettings;
    }
}

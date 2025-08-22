package com.app.financeManagement.Service;

import com.app.financeManagement.DTO.CapitalizationSettingsDTO;

import java.util.List;

public interface CapitalizationSettingsService {
    List<CapitalizationSettingsDTO> getAllCapitalizationSettings();
    CapitalizationSettingsDTO createCapitalizationSettings(CapitalizationSettingsDTO dto);
    CapitalizationSettingsDTO getCapitalizationSettingsById(Long id);
    CapitalizationSettingsDTO updateCapitalizationSettings(Long id, CapitalizationSettingsDTO dto);
    void deleteCapitalizationSettings(Long id);
}

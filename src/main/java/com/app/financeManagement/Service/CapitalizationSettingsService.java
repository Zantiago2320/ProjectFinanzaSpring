package com.app.financeManagement.Service;

import com.app.financeManagement.DTO.CapitalizationSettingsDTO;
import com.app.financeManagement.Entity.CapitalizationSettings;

import java.util.List;

public interface CapitalizationSettingsService {
    CapitalizationSettingsDTO createCapitalizationSettings(CapitalizationSettingsDTO settingsDTO);
    CapitalizationSettingsDTO getCapitalizationSettingsById(long id);
    List<CapitalizationSettingsDTO> getAllCapitalizationSettings();
    CapitalizationSettingsDTO updateCapitalizationSettings(long id, CapitalizationSettingsDTO settingsDTO);
    void deleteCapitalizationSettings(long id);
}

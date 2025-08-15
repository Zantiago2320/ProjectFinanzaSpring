package com.app.financeManagement.Service;

import com.app.financeManagement.DTO.SavinPlanDTO;
import com.app.financeManagement.Entity.SavinPlan;

import java.util.List;

public interface SavingPlanService {
    SavinPlanDTO createSavingPlan(SavinPlanDTO planDTO);
    SavinPlanDTO getSavingPlanById(long id);
    List<SavinPlanDTO> getAllSavingPlans();
    SavinPlanDTO updateSavingPlan(long id, SavinPlanDTO planDTO);
    void deleteSavingPlan(long id);
}

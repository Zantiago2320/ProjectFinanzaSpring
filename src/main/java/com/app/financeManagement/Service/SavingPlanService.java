package com.app.financeManagement.Service;

import com.app.financeManagement.DTO.SavingPlanDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SavingPlanService {

    SavingPlanDTO createSavingPlan(SavingPlanDTO planDTO);

    SavingPlanDTO getSavingPlanById(Long id);

    List<SavingPlanDTO> getAllSavingPlans();

    SavingPlanDTO updateSavingPlan(Long id, SavingPlanDTO planDTO);

    void deleteSavingPlan(Long id);
}

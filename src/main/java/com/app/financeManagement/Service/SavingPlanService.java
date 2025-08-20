package com.app.financeManagement.Service;

import com.app.financeManagement.DTO.SavingPlanDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SavingPlanService {

    SavingPlanDTO createSavingPlan(SavingPlanDTO planDTO);

    SavingPlanDTO getSavingPlanById(long id);

    List<SavingPlanDTO> getAllSavingPlans();

    SavingPlanDTO updateSavingPlan(long id, SavingPlanDTO planDTO);

    void deleteSavingPlan(long id);
}

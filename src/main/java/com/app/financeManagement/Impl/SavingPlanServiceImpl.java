package com.app.financeManagement.Impl;

import com.app.financeManagement.DTO.SavingPlanDTO;
import com.app.financeManagement.Repository.SavingPlanRepository;
import com.app.financeManagement.Entity.SavingPlan;
import com.app.financeManagement.Service.SavingPlanService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SavingPlanServiceImpl implements SavingPlanService {

    private final SavingPlanRepository savingPlanRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public SavingPlanServiceImpl(SavingPlanRepository savingPlanRepository, ModelMapper modelMapper) {
        this.savingPlanRepository = savingPlanRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public SavingPlanDTO createSavingPlan(SavingPlanDTO planDTO) {
        SavingPlan plan = modelMapper.map(planDTO, SavingPlan.class);
        plan = savingPlanRepository.save(plan);
        return modelMapper.map(plan, SavingPlanDTO.class);
    }

    @Override
    public SavingPlanDTO getSavingPlanById(long id) {
        SavingPlan plan = savingPlanRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("SavingPlan not found with id: " + id));
        return modelMapper.map(plan, SavingPlanDTO.class);
    }

    @Override
    public List<SavingPlanDTO> getAllSavingPlans() {
        List<SavingPlan> plans = savingPlanRepository.findAll();
        return plans.stream()
                .map(plan -> modelMapper.map(plan, SavingPlanDTO.class))
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public SavingPlanDTO updateSavingPlan(long id, SavingPlanDTO planDTO) {
        SavingPlan plan = savingPlanRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("SavingPlan not found with id: " + id));
        plan.setName(planDTO.getName());
        plan.setGoalAmount(planDTO.getGoalAmount());
        SavingPlan updatedPlan = savingPlanRepository.save(plan);
        return modelMapper.map(updatedPlan, SavingPlanDTO.class);
    }

    @Override
    public void deleteSavingPlan(long id) {
        if (!savingPlanRepository.existsById(id)) {
            throw new RuntimeException("SavingPlan not found with id: " + id);
        }
        savingPlanRepository.deleteById(id);
    }
}

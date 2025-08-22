package com.app.financeManagement.Impl;

import com.app.financeManagement.DTO.SavingPlanDTO;
import com.app.financeManagement.Repository.SavingPlanRepository;
import com.app.financeManagement.Entity.SavinPlan;
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
        SavinPlan plan = modelMapper.map(planDTO, SavinPlan.class);
        plan = savingPlanRepository.save(plan);
        return modelMapper.map(plan, SavingPlanDTO.class);
    }

    @Override
    public SavingPlanDTO getSavingPlanById(long id) {
        SavinPlan plan = savingPlanRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("SavingPlan not found with id: " + id));
        return modelMapper.map(plan, SavingPlanDTO.class);
    }

    @Override
    public List<SavingPlanDTO> getAllSavingPlans() {
        List<SavinPlan> plans = savingPlanRepository.findAll();
        return plans.stream()
                .map(plan -> modelMapper.map(plan, SavingPlanDTO.class))
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public SavingPlanDTO updateSavingPlan(long id, SavingPlanDTO planDTO) {
        SavinPlan plan = savingPlanRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("SavingPlan not found with id: " + id));
        plan.setPlanName(planDTO.getPlanName());
        plan.setTargetAmount(planDTO.getTargetAmount());
        plan.setDurationMonths(planDTO.getDurationMonths());
        plan.setCreatedAt(planDTO.getCreatedAt());
        plan.setUpdateAt(planDTO.getUpdateAt());
        SavinPlan updatedPlan = savingPlanRepository.save(plan);
        return modelMapper.map(updatedPlan, SavingPlanDTO.class);
    }

    public void deleteSavingPlan(long id) {
        if (!savingPlanRepository.existsById(id)) {
            throw new RuntimeException("SavingPlan not found with id: " + id);
        }
        savingPlanRepository.deleteById(id);
    }
}

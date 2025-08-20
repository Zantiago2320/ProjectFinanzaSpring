package com.app.financeManagement.Impl;

import com.app.financeManagement.DTO.SavingPlanDTO;
import com.app.financeManagement.Repository.UserRepository;
import com.app.financeManagement.Service.SavingPlanService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SavingPlanServiceImpl implements SavingPlanService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepository userRepository;
    public SavingPlanServiceImpl(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Override
    public SavingPlanDTO createSavingPlan(SavingPlanDTO planDTO) {
        return null;
    }

    @Override
    public SavingPlanDTO getSavingPlanById(long id) {
        return null;
    }

    @Override
    public List<SavingPlanDTO> getAllSavingPlans() {
        return List.of();
    }

    @Override
    public SavingPlanDTO updateSavingPlan(long id, SavingPlanDTO planDTO) {
        return null;
    }

    @Override
    public void deleteSavingPlan(long id) {

    }
}

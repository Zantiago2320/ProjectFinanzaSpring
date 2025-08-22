package com.app.financeManagement.Impl;

import com.app.financeManagement.DTO.FinancialProjectionDTO;
import com.app.financeManagement.Repository.FinancialProjectionRepository;
import com.app.financeManagement.Entity.FinancialProjection;
import com.app.financeManagement.Service.FinancialProjectionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialProjectionServiceImpl implements FinancialProjectionService {

    private final FinancialProjectionRepository financialProjectionRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public FinancialProjectionServiceImpl(FinancialProjectionRepository financialProjectionRepository, ModelMapper modelMapper) {
        this.financialProjectionRepository = financialProjectionRepository;
        this.modelMapper = modelMapper;
    }

    public FinancialProjectionDTO createFinancialProjection(FinancialProjectionDTO projectionDTO) {
        FinancialProjection projection = modelMapper.map(projectionDTO, FinancialProjection.class);
        projection = financialProjectionRepository.save(projection);
        return modelMapper.map(projection, FinancialProjectionDTO.class);
    }


    public FinancialProjectionDTO getFinancialProjectionById(Long id) {
        FinancialProjection projection = financialProjectionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("FinancialProjection not found with id: " + id));
        return modelMapper.map(projection, FinancialProjectionDTO.class);
    }

    public List<FinancialProjectionDTO> getAllFinancialProjections() {
        List<FinancialProjection> projections = financialProjectionRepository.findAll();
        return projections.stream()
                .map(projection -> modelMapper.map(projection, FinancialProjectionDTO.class))
                .collect(java.util.stream.Collectors.toList());
    }

    public FinancialProjectionDTO updateFinancialProjection(Long id, FinancialProjectionDTO projectionDTO) {
        FinancialProjection projection = financialProjectionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("FinancialProjection not found with id: " + id));
        projection.setProjectedIncome(projectionDTO.getProjectedIncome());
        projection.setProjectedExpenses(projectionDTO.getProjectedExpenses());
        projection.setProjectionDate(projectionDTO.getProjectionDate());
        projection.setCreatedAt(projectionDTO.getCreatedAt());
        projection.setUpdateAt(projectionDTO.getUpdateAt());
        FinancialProjection updatedProjection = financialProjectionRepository.save(projection);
        return modelMapper.map(updatedProjection, FinancialProjectionDTO.class);
    }

    public void deleteFinancialProjection(Long id) {
        if (!financialProjectionRepository.existsById(id)) {
            throw new RuntimeException("FinancialProjection not found with id: " + id);
        }
        financialProjectionRepository.deleteById(id);
    }
}

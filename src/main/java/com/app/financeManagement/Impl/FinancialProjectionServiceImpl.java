package com.app.financeManagement.Impl;

import com.app.financeManagement.DTO.FinancialProjectionDTO;
import com.app.financeManagement.Repository.CategoryRepository;
import com.app.financeManagement.Repository.UserRepository;
import com.app.financeManagement.Service.FinancialProjectionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialProjectionServiceImpl implements FinancialProjectionService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepository userRepository;
    public FinancialProjectionServiceImpl(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Override
    public FinancialProjectionDTO createFinancialProjection(FinancialProjectionDTO projectionDTO) {
        return null;
    }

    @Override
    public FinancialProjectionDTO getFinancialProjectionById(long id) {
        return null;
    }

    @Override
    public List<FinancialProjectionDTO> getAllFinancialProjections() {
        return List.of();
    }

    @Override
    public FinancialProjectionDTO updateFinancialProjection(long id, FinancialProjectionDTO projectionDTO) {
        return null;
    }

    @Override
    public void deleteFinancialProjection(long id) {

    }
}

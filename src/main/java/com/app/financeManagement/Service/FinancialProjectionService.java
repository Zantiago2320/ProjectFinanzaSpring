package com.app.financeManagement.Service;

import com.app.financeManagement.DTO.FinancialProjectionDTO;
import com.app.financeManagement.Entity.FinancialProjection;

import java.util.List;

public interface FinancialProjectionService {
    FinancialProjectionDTO createFinancialProjection(FinancialProjectionDTO projectionDTO);
    FinancialProjectionDTO getFinancialProjectionById(Long id);
    List<FinancialProjectionDTO> getAllFinancialProjections();
    FinancialProjectionDTO updateFinancialProjection(Long id, FinancialProjectionDTO projectionDTO);
    void deleteFinancialProjection(Long id);
}

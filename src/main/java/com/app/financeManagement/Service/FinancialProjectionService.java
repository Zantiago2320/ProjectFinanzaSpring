package com.app.financeManagement.Service;

import com.app.financeManagement.DTO.FinancialProjectionDTO;
import com.app.financeManagement.Entity.FinancialProjection;

import java.util.List;

public interface FinancialProjectionService {
    FinancialProjectionDTO createFinancialProjection(FinancialProjectionDTO projectionDTO);
    FinancialProjectionDTO getFinancialProjectionById(long id);
    List<FinancialProjectionDTO> getAllFinancialProjections();
    FinancialProjectionDTO updateFinancialProjection(long id, FinancialProjectionDTO projectionDTO);
    void deleteFinancialProjection(long id);
}

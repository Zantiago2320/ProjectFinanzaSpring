package com.app.financeManagement.Service;

import com.app.financeManagement.DTO.SavingMovementDTO;
import com.app.financeManagement.Entity.SavingMovement;

import java.util.List;

public interface SavingMovementService {
    SavingMovementDTO createSavingMovement(SavingMovementDTO movementDTO);
    SavingMovementDTO getSavingMovementById(long id);
    List<SavingMovementDTO> getAllSavingMovements();
    SavingMovementDTO updateSavingMovement(long id, SavingMovementDTO movementDTO);
    void deleteSavingMovement(long id);
}

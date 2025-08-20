package com.app.financeManagement.Impl;

import com.app.financeManagement.DTO.SavingMovementDTO;
import com.app.financeManagement.Repository.UserRepository;
import com.app.financeManagement.Service.SavingMovementService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SavingMovementServiceImp implements SavingMovementService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepository userRepository;
    public SavingMovementServiceImp(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Override
    public SavingMovementDTO createSavingMovement(SavingMovementDTO movementDTO) {
        return null;
    }

    @Override
    public SavingMovementDTO getSavingMovementById(long id) {
        return null;
    }

    @Override
    public List<SavingMovementDTO> getAllSavingMovements() {
        return List.of();
    }

    @Override
    public SavingMovementDTO updateSavingMovement(long id, SavingMovementDTO movementDTO) {
        return null;
    }

    @Override
    public void deleteSavingMovement(long id) {

    }
}

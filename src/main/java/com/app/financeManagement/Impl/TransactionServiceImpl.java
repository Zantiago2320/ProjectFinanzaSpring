package com.app.financeManagement.Impl;

import com.app.financeManagement.DTO.TransactionDTO;
import com.app.financeManagement.Entity.Transaction;
import com.app.financeManagement.Repository.TransactionRepository;
import com.app.financeManagement.Service.TransactionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository, ModelMapper modelMapper) {
        this.transactionRepository = transactionRepository;
        this.modelMapper = modelMapper;

    }
}

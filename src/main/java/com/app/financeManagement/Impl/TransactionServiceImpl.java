package com.app.financeManagement.Impl;

import com.app.financeManagement.DTO.TransactionDTO;
import com.app.financeManagement.Entity.Transaction;
import com.app.financeManagement.Repository.TransactionRepository;
import com.app.financeManagement.Service.TransactionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    @Override
    public TransactionDTO createTransaction(TransactionDTO transactionDTO) {
        Transaction transaction = modelMapper.map(transactionDTO, Transaction.class);
        Transaction savedTransaction = transactionRepository.save(transaction);
        return modelMapper.map(savedTransaction, TransactionDTO.class);
    }

    @Override
    public TransactionDTO getTransactionById(Long transactionId) {
        Optional<Transaction> transactionOptional = transactionRepository.findById(transaction Id);
        if (transactionOptional.isPresent()) {
            Transaction transaction = transactionOptional.get();
            return modelMapper.map(transaction, TransactionDTO.class);
        }
        return null;
    }

    @Override
    public List<TransactionDTO> getAllTransactions() {
        List<Transaction> transactions = transactionRepository.findAll();
        if (transactions != null && !transactions.isEmpty()) {
            return transactions.stream()
                    .map(transaction -> modelMapper.map(transaction, TransactionDTO.class))
                    .toList();
        }
        // Return an empty list if no transactions are found
        return List.of();
    }

    @Override
    public TransactionDTO updateTransaction(Long transactionId, TransactionDTO transactionDTO) {
        return null;
    }

    @Override
    public boolean deleteTransaction(Long transactionId) {
        return false;
    }
}

package com.app.financeManagement.Impl;

import com.app.financeManagement.DTO.TransactionDTO;
import com.app.financeManagement.Entity.Category;
import com.app.financeManagement.Entity.Transaction;
import com.app.financeManagement.Repository.CategoryRepository;
import com.app.financeManagement.Repository.TransactionRepository;
import com.app.financeManagement.Service.TransactionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;
    @Autowired
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository, CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.transactionRepository = transactionRepository;
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;

    }

    // TransactionServiceImpl.java
    public TransactionDTO createTransaction(TransactionDTO transactionDTO) {
        Category category = categoryRepository.findById(transactionDTO.getIdCategory())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        Transaction transaction = modelMapper.map(transactionDTO, Transaction.class);
        transaction.setCategory(category);

        Transaction savedTransaction = transactionRepository.save(transaction);
        return modelMapper.map(savedTransaction, TransactionDTO.class);
    }

    @Override
    public TransactionDTO getTransactionById(Long transactionId) {
        Transaction transaction = transactionRepository.findById(transactionId)
                .orElseThrow(() -> new RuntimeException("Transaction not found with id: " + transactionId));
        return modelMapper.map(transaction, TransactionDTO.class);
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
        Transaction transaction = transactionRepository.findById(transactionId)
                .orElseThrow(() -> new RuntimeException("Transaction not found with id: " + transactionId));
        transaction.setAmount(transactionDTO.getAmount());
        transaction.setDescription(transactionDTO.getDescription());
        transaction.setTransactionDate(transactionDTO.getTransactionDate());
        Transaction updatedTransaction = transactionRepository.save(transaction);
        return modelMapper.map(updatedTransaction, TransactionDTO.class);
    }

    public boolean deleteTransaction(Long transactionId) {
        if (!transactionRepository.existsById(transactionId)) {
            throw new RuntimeException("Transaction not found with id: " + transactionId);
        }
        transactionRepository.deleteById(transactionId);
        return true;
    }
}

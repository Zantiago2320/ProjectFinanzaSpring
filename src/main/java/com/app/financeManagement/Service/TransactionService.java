package com.app.financeManagement.Service;

import com.app.financeManagement.DTO.TransactionDTO;
import java.util.List;

public interface TransactionService {

	TransactionDTO createTransaction(TransactionDTO transactionDTO);

	TransactionDTO getTransactionById(Long transactionId);

	List<TransactionDTO> getAllTransactions();

	TransactionDTO updateTransaction(Long transactionId, TransactionDTO transactionDTO);

	boolean deleteTransaction(Long transactionId);
}

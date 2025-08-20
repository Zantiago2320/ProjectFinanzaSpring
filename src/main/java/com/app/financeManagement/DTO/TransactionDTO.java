package com.app.financeManagement.DTO;

import java.time.LocalDateTime;

import com.app.financeManagement.Entity.Category;
import lombok.Data;

@Data
public class TransactionDTO {
    private Long idTransaction;
    private long userId;
    private Category category;
    private String type;
    private Double amount;
    private String description;
    private LocalDateTime transactionDate;
}

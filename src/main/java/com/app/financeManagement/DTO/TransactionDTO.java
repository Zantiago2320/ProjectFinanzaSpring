package com.app.financeManagement.DTO;

import java.time.LocalDateTime;

import lombok.*;

@Getter
@Setter
@Data
public class TransactionDTO {
    private Long idTransaction;
    private Long userId;
    private Long idCategory;
    private String type;
    private Double amount;
    private String description;
    private LocalDateTime transactionDate;


}

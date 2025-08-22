package com.app.financeManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "FinancialProjections")
@Data
public class FinancialProjection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ide_financial_projection", nullable = false, unique = true)
    private Long idFinancialProjection;

    @Column(name = "projected_income", nullable = false)
    private BigDecimal projectedIncome;

    @Column(name = "projected_expenses", nullable = false)
    private BigDecimal projectedExpenses;

    @Column(name = "projection_date", nullable = false)
    private LocalDateTime projectionDate;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "update_at", nullable = false)
    private LocalDateTime updateAt;

}

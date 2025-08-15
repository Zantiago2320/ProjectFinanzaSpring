package com.app.financeManagement.Repository;

import com.app.financeManagement.Entity.FinancialProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialProjectionRepository extends JpaRepository<FinancialProjection, Long> {
}

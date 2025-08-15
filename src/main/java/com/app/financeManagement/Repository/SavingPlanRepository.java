package com.app.financeManagement.Repository;

import com.app.financeManagement.Entity.SavinPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingPlanRepository extends JpaRepository<SavinPlan, Long> {
}


package com.app.financeManagement.Repository;

import com.app.financeManagement.Entity.SavingMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingMovementRepository extends JpaRepository<SavingMovement, Long> {
}

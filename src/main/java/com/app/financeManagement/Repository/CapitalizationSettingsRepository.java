package com.app.financeManagement.Repository;

import com.app.financeManagement.Entity.CapitalizationSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapitalizationSettingsRepository extends JpaRepository<CapitalizationSettings, Long> {
}

package com.app.financeManagement.Repository;

import com.app.financeManagement.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    default Optional<Category> findById(Long idCategory) {
        return null;
    }
}


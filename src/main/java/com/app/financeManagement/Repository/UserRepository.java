package com.app.financeManagement.Repository;

import com.app.financeManagement.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<Object> findByEmail(String email);
}

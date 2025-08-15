package com.app.financeManagement.Entity;

import jakarta.persistence.*;

import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "Users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ide_user", nullable = false, unique = true)
    private long idUser;

    @Column(name = "name", nullable = false, unique = true, length = 100)
    private String name;

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "password", nullable = false, unique = true, length = 100)
    private String password;

    @Column(name = "role", nullable = false, unique = true, length = 50)
    private String role;

    @Column(name = "created_at", nullable = false, unique = true)
    private LocalDateTime createdAt;

    @Column(name = "update_at", nullable = false)
    private LocalDateTime updateAt;

}

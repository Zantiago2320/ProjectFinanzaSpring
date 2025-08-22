package com.app.financeManagement.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserDTO {
    private Long idUser;
    private String name;
    private String email;
    private String password;
    private String role;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
}

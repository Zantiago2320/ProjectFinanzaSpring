package com.app.financeManagement.Service;

import com.app.financeManagement.DTO.UserDTO;

public interface UserService {

    UserDTO findAllUsers();

    //UserDTO authenticateUser(String email, String password);

    UserDTO createUser(UserDTO userDTO);

    UserDTO getUserById(Long userId);

    UserDTO updateUser(Long userId, UserDTO userDTO);

    void deleteUser(Long userId);
}


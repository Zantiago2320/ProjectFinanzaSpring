package com.app.financeManagement.Service;

import com.app.financeManagement.DTO.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO findAllUsers();

    List<UserDTO> getAllUsers();

    //UserDTO authenticateUser(String email, String password);

    UserDTO createUser(UserDTO userDTO);

    UserDTO getUserById(Long userId);

    UserDTO updateUser(Long userId, UserDTO userDTO);

    boolean deleteUser(Long userId);
}

//
package com.app.financeManagement.Controller;

import com.app.financeManagement.DTO.UserDTO;
import com.app.financeManagement.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController{

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //Endpoint to get all users / Punto final para obtener todos los usuarios

    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<UserDTO> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    //Endpoint to crate a new user / Punto final para crear un nuevo usuario

    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@Validated @RequestBody UserDTO userDTO) {
        userService.createUser(userDTO);
        return ResponseEntity.ok(userDTO);
    }
}

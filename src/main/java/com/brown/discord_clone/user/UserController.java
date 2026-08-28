package com.brown.discord_clone.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/user")
    public List<UserDTO> getUsers() {
        // Implementation for fetching users
        return userService.getUsers(); // Replace with actual implementation
    }

    @GetMapping("/user/{id}")
    public UserDTO getUserById(@PathVariable Integer id) {
        // Implementation for fetching a user by ID 
        return userService.getUserById(id); // Replace with actual implementation
    }

    @PostMapping("/user")
    public UserDTO createUser(@RequestBody CreateUserDTO createUserDTO) {
        // UserDTO for creating a new user
        return userService.createUser(createUserDTO); // Replace with actual implementation
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Integer id) {  
        // Implementation for deleting a user by ID
        userService.deleteUser(id); // Replace with actual implementation
    }

    @PutMapping("/user/{id}")
    public UserDTO updateUser(@PathVariable Integer id, @RequestBody UserDTO user) {  
        // Implementation for updating a user by ID
        return userService.updateUser(id, user); // Replace with actual implementation
    }
}

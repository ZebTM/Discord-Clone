package com.brown.discord_clone.user;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    
    @GetMapping("/user")
    public List<User> getUsers() {
        // Implementation for fetching users
        return null; // Replace with actual implementation
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Integer id) {
        // Implementation for fetching a user by ID 
        return null; // Replace with actual implementation
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        // Implementation for creating a new user
        return null; // Replace with actual implementation
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Integer id) {  
        // Implementation for deleting a user by ID
        // Replace with actual implementation
    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable Integer id, @RequestBody User user) {  
        // Implementation for updating a user by ID
        return null; // Replace with actual implementation
    }



}

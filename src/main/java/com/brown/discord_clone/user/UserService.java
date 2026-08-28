package com.brown.discord_clone.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<UserDTO> getUsers() {
        return userRepository.findAll().stream().map(UserDTO::new).toList();
    }

    public UserDTO getUserById(Integer id) {
        return userRepository.findById(id).map(UserDTO::new).orElse(null);
    }

    public UserDTO createUser(CreateUserDTO createUserDTO) {
        User user = new User();
        user.setUsername(createUserDTO.username());
        user.setEmail(createUserDTO.email());
        user.setHashedPassword(passwordEncoder.encode(createUserDTO.password()));
        return new UserDTO(userRepository.save(user));
    }

    public UserDTO updateUser(Integer id, UserDTO updatedUser) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setUsername(updatedUser.username());
            existingUser.setEmail(updatedUser.email());
            // Update other fields as necessary
            return new UserDTO(userRepository.save(existingUser));
        }
        return null;
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}

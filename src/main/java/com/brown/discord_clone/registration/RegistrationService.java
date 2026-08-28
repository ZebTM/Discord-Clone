package com.brown.discord_clone.registration;

import org.springframework.stereotype.Service;

import com.brown.discord_clone.user.User;
import com.brown.discord_clone.user.UserRepository;

@Service
public class RegistrationService {

    private final UserRepository userRepository;

    public RegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean register(String username, String email, String password) {
        if (userRepository.existsByUsername(username)) {
            return false;
        }

        User newUser = User.builder()
                .username(username)
                .email(email)
                .hashedPassword(password)
                .build();
        userRepository.save(newUser);
        return true;
    }
}

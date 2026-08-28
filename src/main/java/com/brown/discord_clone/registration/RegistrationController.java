package com.brown.discord_clone.registration;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/register")
    public ResponseEntity<RegistrationResponse> handleRegistration(
            @RequestParam String username,
            @RequestParam String email,
            @RequestParam String password) {
        boolean successful = registrationService.register(username, email, password);
        String message = successful ? "Registration successful" : "Username already exists";

        return ResponseEntity.ok(new RegistrationResponse(successful, message));
    }
}
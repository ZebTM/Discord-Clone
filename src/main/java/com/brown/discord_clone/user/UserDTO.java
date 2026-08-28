package com.brown.discord_clone.user;

public record UserDTO(String id, String username, String email) {

    public UserDTO(User user) {
        this(user.getId().toString(), user.getUsername(), user.getEmail());
    }
}
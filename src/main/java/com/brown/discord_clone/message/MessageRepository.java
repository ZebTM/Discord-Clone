package com.brown.discord_clone.message;

import java.util.List;

public interface MessageRepository extends org.springframework.data.jpa.repository.JpaRepository<Message, Integer> {
    List<Message> findBySenderId(Integer userId);
}

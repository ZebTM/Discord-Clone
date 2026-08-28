package com.brown.discord_clone.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    
    @Autowired
    private MessageRepository messageRepository;

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    public Message getMessageById(Integer messageId) {
        return messageRepository.findById(messageId).orElse(null);
    }

    public Message updateMessage(Integer messageId, Message updatedMessage) {
        Message existingMessage = messageRepository.findById(messageId).orElse(null);
        if (existingMessage != null) {
            existingMessage.setContent(updatedMessage.getContent());
            return messageRepository.save(existingMessage);
        }
        return null;
    }

    public void deleteMessage(Integer userId, Integer messageId) {
        messageRepository.deleteById(messageId);
    }   

    public List<Message> getMessagesByUserId(Integer userId) {
        return messageRepository.findBySenderId(userId);
    }

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }
}

package com.chatbot.whatsapp_chatbot.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MessageLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
    private String reply;
    private LocalDateTime timestamp;

    @PrePersist
    public void setTimestamp() {
        this.timestamp = LocalDateTime.now();
    }

    // Getters and Setters
    public Long getId() { return id; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getReply() { return reply; }
    public void setReply(String reply) { this.reply = reply; }

    public LocalDateTime getTimestamp() { return timestamp; }
}
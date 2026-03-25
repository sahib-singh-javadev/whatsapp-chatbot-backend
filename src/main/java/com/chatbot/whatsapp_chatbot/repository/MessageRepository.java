package com.chatbot.whatsapp_chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatbot.whatsapp_chatbot.model.MessageLog;

public interface MessageRepository extends JpaRepository<MessageLog, Long> {
}
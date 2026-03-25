package com.chatbot.whatsapp_chatbot.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chatbot.whatsapp_chatbot.model.MessageLog;
import com.chatbot.whatsapp_chatbot.repository.MessageRepository;

@Service
public class ChatService {

    @Autowired
    private MessageRepository repository;

    public String getReply(String message) {

        String reply;

        if (message == null) {
            reply = "Empty message";
        } else {
            switch (message.toLowerCase()) {
                case "hi":
                    reply = "Hello";
                    break;
                case "bye":
                    reply = "Goodbye";
                    break;
                case "hello":
                    reply = "Hi there!";
                    break;
                case "thanks":
                    reply = "You're welcome!";
                    break;
                default:
                    reply = "I didn't understand that.";
            }
        }

        // 🔥 Save to DB
        MessageLog log = new MessageLog();
        log.setMessage(message);
        log.setReply(reply);

        repository.save(log);

        return reply;
    }
}
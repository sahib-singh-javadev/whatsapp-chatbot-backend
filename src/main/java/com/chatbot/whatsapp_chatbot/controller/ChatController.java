package com.chatbot.whatsapp_chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.chatbot.whatsapp_chatbot.model.MessageRequest;
import com.chatbot.whatsapp_chatbot.model.MessageResponse;
import com.chatbot.whatsapp_chatbot.service.ChatService;

import io.swagger.v3.oas.annotations.Operation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/webhook")
public class ChatController {

    @Autowired
    private ChatService chatService;

    // ✅ POST API (actual chatbot)
    @Operation(summary = "Receive message and return chatbot reply")
    @PostMapping("/message")
    public MessageResponse reply(@RequestBody MessageRequest request) {

        String message = request.getMessage();
        System.out.println("Received: " + message);

        String response = chatService.getReply(message);

        return new MessageResponse(response);
    }

    // ✅ Health check
    @GetMapping("/test")
    public String home() {
        return "Backend is running!";
    }

    // ✅ Friendly message for browser users
    @GetMapping("/message")
    public String messageInfo() {
        return "This endpoint only supports POST requests. Please use Postman or Swagger UI.";
    }
}
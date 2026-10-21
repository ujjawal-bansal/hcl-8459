package com.example.day9.notification;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements NotificationService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}

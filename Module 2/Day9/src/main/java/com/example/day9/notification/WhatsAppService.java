package com.example.day9.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class WhatsAppService implements NotificationService {
    @Override
    public void sendMessage(String message) {
        System.out.println("WhatsApp: " + message);
    }
}

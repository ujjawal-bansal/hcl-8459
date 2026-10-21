package com.example.day9.notification;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private final NotificationService notificationService;

    public Student(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyStudent() {
        notificationService.sendMessage("Your assessment is scheduled");
    }
}

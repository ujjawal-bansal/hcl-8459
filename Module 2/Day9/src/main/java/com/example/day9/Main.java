package com.example.day9;

import com.example.day9.fielddi.FieldConfig;
import com.example.day9.notification.NotificationConfig;
import com.example.day9.notification.Student;
import com.example.day9.setterdi.Employee;
import com.example.day9.setterdi.SetterConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var setterContext = new AnnotationConfigApplicationContext(SetterConfig.class);
        setterContext.getBean(Employee.class).display();
        setterContext.close();

        var fieldContext = new AnnotationConfigApplicationContext(FieldConfig.class);
        fieldContext.getBean(com.example.day9.fielddi.Employee.class).display();
        fieldContext.close();

        var notificationContext = new AnnotationConfigApplicationContext(NotificationConfig.class);
        notificationContext.getBean(Student.class).notifyStudent();
        notificationContext.close();
    }
}

package com.punitmani25.gmail.Module1.impl;

import com.punitmani25.gmail.Module1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
@Qualifier("emaill")
//@ConditionalOnProperty(name = "notification.type",havingValue = "email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("email send...."+message);
    }
}

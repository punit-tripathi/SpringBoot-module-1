package com.punitmani25.gmail.Module1.impl;

import com.punitmani25.gmail.Module1.NotificationService;
import com.sun.nio.sctp.Association;
import com.sun.nio.sctp.Notification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Smss")
//@ConditionalOnProperty(name = "notification.type",havingValue = "sms")
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message){
        System.out.println("sms sending.."+message);
    }
}

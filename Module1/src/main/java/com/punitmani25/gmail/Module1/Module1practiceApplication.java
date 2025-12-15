package com.punitmani25.gmail.Module1;

import com.punitmani25.gmail.Module1.impl.EmailNotificationService;
import com.punitmani25.gmail.Module1.impl.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1practiceApplication implements CommandLineRunner {
//	@Autowired
//	final NotificationService notificationServiceobj;//dependency injection
//	public Module1practiceApplication( NotificationService notificationServiceobj){
//		this.notificationServiceobj=notificationServiceobj;//constructor DI//preferred
//	}
	@Autowired
	Map<String,NotificationService>notificationServiceMap=new HashMap<>();
	public static void main(String[] args) {

		SpringApplication.run(Module1practiceApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
//		notificationServiceobj=new SmsNotificationService();
//		notificationServiceobj.send("hi");
		for(var notificationService:notificationServiceMap.entrySet()){
				 System.out.println(notificationService.getKey());
				 notificationService.getValue().send("Hey");
		}
	}
}

package com.punitmani25.gmail.Module1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


//    @Scope("request")
    @Bean
    public Payment payment() {
        // more logic
        return new Payment();
    }
}

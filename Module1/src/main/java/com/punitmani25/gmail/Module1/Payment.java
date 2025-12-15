package com.punitmani25.gmail.Module1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Payment {

    public void pay(){
        System.out.println("Paying");
    }
    @PostConstruct
    public void before(){
        System.out.println("after creation");
    }
    @PreDestroy
    public void affter(){
        System.out.println("Before Destroy");
    }

}

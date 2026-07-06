package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderPlaced {
    Notification notification;
    @Autowired
    OrderPlaced(@Qualifier("sms") Notification notification){
        this.notification = notification;
    }
    public void order(){
        notification.send();
        System.out.println("OrderPlaced");
    }
}


package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class EmailNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Email Sent");
    }
}

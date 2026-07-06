package com.example.aoplogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopLoggingExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(AopLoggingExampleApplication.class, args);
    }
}

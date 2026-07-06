package com.example.aoplogging.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.example.aoplogging.service..*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Executing method: " + joinPoint.getSignature().toShortString());
        try {
            Object result = joinPoint.proceed();
            long duration = System.currentTimeMillis() - start;
            System.out.println("Completed method: " + joinPoint.getSignature().toShortString() + " in " + duration + "ms");
            return result;
        } catch (Throwable ex) {
            long duration = System.currentTimeMillis() - start;
            System.out.println("Failed method: " + joinPoint.getSignature().toShortString() + " in " + duration + "ms");
            throw ex;
        }
    }
}

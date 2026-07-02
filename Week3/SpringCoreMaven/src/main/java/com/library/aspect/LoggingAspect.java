package com.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

// Exercise 3 & 8: AOP Logging Aspect
@Aspect
@Component
public class LoggingAspect {

    // Exercise 8: Before advice - runs BEFORE any method in com.library package
    @Before("execution(* com.library.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[AOP BEFORE] Method called: "
                + joinPoint.getSignature().getName());
    }

    // Exercise 8: After advice - runs AFTER any method in com.library package
    @After("execution(* com.library.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("[AOP AFTER] Method completed: "
                + joinPoint.getSignature().getName());
    }

    // Exercise 3: Around advice - logs execution TIME of methods
    @Around("execution(* com.library.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed(); // execute the actual method

        long endTime = System.currentTimeMillis();
        System.out.println("[AOP AROUND] " + joinPoint.getSignature().getName()
                + " executed in " + (endTime - startTime) + " ms");

        return result;
    }
}
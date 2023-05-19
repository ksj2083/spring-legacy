package com.mycatgib.springstudy.aop.basic1;


import org.aspectj.lang.ProceedingJoinPoint;
public class LoggerAdvice {
    
    public void loggerProcess(ProceedingJoinPoint jp) throws Throwable {
        long start = System.currentTimeMillis();

        jp.proceed();

        long end = System.currentTimeMillis();
        System.out.println("time: " + (end-start));

    }
}

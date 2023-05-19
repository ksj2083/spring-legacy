package com.mycatgib.springstudy.aop.basic3;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class MyAspect {

    //접근제한자 결과값 메소드(파라미터)
//    @Before("execution(public void com.mycatgib.springstudy.aop.basic3.Search*.*(..))")
//    public void dataAttributeSearch(JoinPoint joinPoint) {
//
//        System.out.println(joinPoint.getSignature().getName() + " Before : " + new Date());
//    }
//
//    @After("execution(public void com.mycatgib.springstudy.aop.basic3.Search*.*(..))")
//    public void afterSearchAdvice(JoinPoint joinPoint) {
//
//        System.out.println("@@After");
//    }
//
//    @AfterReturning("execution(public void com.mycatgib.springstudy.aop.basic3.Search*.*(..))")
//    public void afterSearchReturningAdvice(JoinPoint joinPoint) {
//
//        System.out.println("@@AfterReturning");
//    }
//
//    @AfterThrowing("execution(public void com.mycatgib.springstudy.aop.basic3.Search*.*(..))")
//    public void afterSearchThrowingReturningAdvice(JoinPoint joinPoint) {
//
//        System.out.println("@@AfterThrowing");
//    }

    @Around("execution(public void com.mycatgib.springstudy.aop.basic3.Search*.*(..))")
    public void AroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        Signature signature = joinPoint.getSignature();

        System.out.println(signature.getName() + " 어라운드 전");
        joinPoint.proceed();
        System.out.println(signature.getName() + " 어라운드 후");
    }
}
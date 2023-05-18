package com.mycatgib.springstudy.aop.basic1;

public class AfterReturningAdvice implements org.springframework.aop.BeforeAdvice {

    public void afterReturningMethod() {
        System.out.println("afterReturningMethod()");
    }
}

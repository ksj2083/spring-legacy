package com.mycatgib.springstudy.di.basic5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class ConfigDemoMain {
          public static void main(String[] args) {
                    ApplicationContext applicationContext =
                            new AnnotationConfigApplicationContext(ConfigDemo.class);

//                    System.out.println(applicationContext.getBean("getStateServer"));
                    System.out.println(applicationContext.getBean("stateServer"));

                    System.out.println(applicationContext.getBean("getDmlServer"));

                    Map<String,String> fruits = (Map<String, String>) applicationContext.getBean("fruits");

                    System.out.println(fruits);

          }
}

package com.mycatgib.springstudy.di.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PersonMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext("src/main/java/com/mycatgib/springstudy/di/basic/person.xml");

        //singleton 패턴은 getBean 이전에 이미 호출된다.
        Person person1 = (Person) applicationContext.getBean("person1");
        System.out.println(person1);

        //prototype 패턴은 getBean 하는 시점에 생성자가 호출된다.
        Person person2 = (Person) applicationContext.getBean("person2");
        System.out.println(person2);


        ((Person)applicationContext.getBean("person2")).setName("재홍");
        System.out.println(((Person)applicationContext.getBean("person2")).getName());
        //prototype 패턴의 경우 "김가영" 출력된다.

    }
}

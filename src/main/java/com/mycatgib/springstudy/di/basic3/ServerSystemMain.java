package com.mycatgib.springstudy.di.basic3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServerSystemMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext("src/main/java/com/mycatgib/springstudy/di/basic3/Dbms.xml");

        ServerSystem serverSystem = (ServerSystem) applicationContext.getBean("serverSystem");
        System.out.println(serverSystem);
    }
}

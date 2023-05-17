package com.mycatgib.springstudy.di.basic4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ControllerService {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext("src/main/java/com/mycatgib/springstudy/di/basic4/service.xml");
        UserService userService = (UserService) applicationContext.getBean("adminUserServiceImpl");

        userService.findUser();
    }
}

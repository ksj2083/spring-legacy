package com.mycatgib.springstudy.aop.basic1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DaoMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext("src/main/java/com/mycatgib/springstudy/aop/basic1/dao.xml");
        Dao dao = (Dao) applicationContext.getBean("oracleDao");
        //dao.select();
        dao.update(10);
    }
}

package com.mycatgib.springstudy.aop.basic3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SearchMain {
    public static void main(String[] args) {

        ApplicationContext applicationContext=
                new FileSystemXmlApplicationContext("src/main/java/com/mycatgib/springstudy/aop/basic3/search.xml");

        Search search = (Search) applicationContext.getBean("adminSearch");

        search.domSaxSearch();
//        search.fileSearch();
//        search.xmlParsing();
    }
}

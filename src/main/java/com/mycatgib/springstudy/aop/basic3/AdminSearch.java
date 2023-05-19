package com.mycatgib.springstudy.aop.basic3;

import org.springframework.stereotype.Component;

@Component
public class AdminSearch implements Search {
    @Override
    public void fileSearch() {
        System.out.println("fileSearch()");
    }

    @Override
    public void xmlParsing() {
        System.out.println("xmlParsing()");
    }

    @Override
    public void domSaxSearch() {
        System.out.println("domSaxSearch()");
//        int tmp = 10/0;

    }
}

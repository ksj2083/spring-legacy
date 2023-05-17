package com.mycatgib.springstudy.di.basic4;

import org.springframework.stereotype.Component;

@Component
public class MyBatisDaoImpl implements UserDao {
    @Override
    public void selectAllUser() {
        System.out.println("MyBatis selectAllUser()");
    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }
}

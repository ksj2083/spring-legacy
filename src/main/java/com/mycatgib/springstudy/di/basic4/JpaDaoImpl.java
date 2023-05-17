package com.mycatgib.springstudy.di.basic4;

import org.springframework.stereotype.Component;

@Component
public class JpaDaoImpl implements UserDao {
    @Override
    public void selectAllUser() {
        System.out.println("JpaDao selectAllUser()");
    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }
}

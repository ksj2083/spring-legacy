package com.mycatgib.springstudy.aop.basic1;

public class MySqlDao implements Dao {

    @Override
    public void update(int x) {
        System.out.println("MySqlDao update();");
    }

    @Override
    public void select() {
        System.out.println("MySqlDao select();");
    }
}

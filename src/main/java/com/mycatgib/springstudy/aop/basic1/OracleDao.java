package com.mycatgib.springstudy.aop.basic1;

public class OracleDao implements Dao {
    @Override
    public void update(int x) {
        System.out.println("OracleDao update();");
        //throw new RuntimeException();
    }

    @Override
    public void select() {
        System.out.println("OracleDao select();");
    }
}

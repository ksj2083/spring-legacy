package com.mycatgib.springstudy.di.basic4;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AdminUserServiceImpl implements UserService {

    @Resource(name = "jpaDaoImpl")
    private UserDao jpaDao;

    @Resource(name = "myBatisDaoImpl")
    private UserDao myBatisDao;

    @Override
    public void register() {

    }

    @Override
    public void findUser() {
        myBatisDao.selectAllUser();
    }
}

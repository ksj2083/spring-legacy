package com.mycatgib.springstudy.di.basic3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServerSystem {

    private DbmsSystem dbmsSystem;

    @Autowired
    public ServerSystem(DbmsSystem dbmsSystem) {
        this.dbmsSystem = dbmsSystem;
    }

    @Override
    public String toString() {
        return "ServerSystem{" +
                "dbmsSystem=" + dbmsSystem +
                '}';
    }
}

package com.mycatgib.springstudy.di.basic5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ConfigDemo {
          @Bean(name = "stateServer")
          public StateServer getStateServer() {
                    return new StateServer("127.0.0.1:8080:mysql", 7777, "scott", "tiger");
          }

          @Bean
          public DmlServer getDmlServer() {
                    return new DmlServer(
                            new StateServer("211.89.0.1:88:oracle", 8888, "bit", "bit1234")
                    );
          }
          

          @Bean(name = "fruits")
          public Map<String, String> getMap() {
                    HashMap<String, String> map = new HashMap<>();
                    map.put("a", "딸기");
                    map.put("b", "사과");
                    map.put("c", "바나나");

                    return map;
          }

//          @Bean
//          public Properties getProperties() {
//                    Properties p = new Properties();
//                    p.put("/web/list/userList", getMap());
//                    p.put("/web/login/userLogin", getDmlServer());
//                    return p;
//          }
}




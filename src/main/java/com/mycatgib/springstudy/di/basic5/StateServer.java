package com.mycatgib.springstudy.di.basic5;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Scope(value = "singleton")
@Component
@ComponentScan(value = "com.mycatgib.springstudy.di.basic5")
public class StateServer {

          @Value("127.0.0.1:8080:dbmsMySql")
          private String serverUrl;
          private int port;
          private String account;
          private String password;

          public StateServer() {
          }

          public StateServer(String serverUrl, int port, String account, String password) {
                    this.serverUrl = serverUrl;
                    this.port = port;
                    this.account = account;
                    this.password = password;
          }

          public String getServerUrl() {
                    return serverUrl;
          }

          public void setServerUrl(String serverUrl) {
                    this.serverUrl = serverUrl;
          }

          public int getPort() {
                    return port;
          }

          public void setPort(int port) {
                    this.port = port;
          }

          public String getAccount() {
                    return account;
          }

          public void setAccount(String account) {
                    this.account = account;
          }

          public String getPassword() {
                    return password;
          }

          public void setPassword(String password) {
                    this.password = password;
          }

          @Override
          public String toString() {
                    return "StateServer{" +
                            "serverUrl='" + serverUrl + '\'' +
                            ", port=" + port +
                            ", account='" + account + '\'' +
                            ", password='" + password + '\'' +
                            '}';
          }
}

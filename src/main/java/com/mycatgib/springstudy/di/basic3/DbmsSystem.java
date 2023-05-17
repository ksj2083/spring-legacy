package com.mycatgib.springstudy.di.basic3;

import org.springframework.beans.factory.annotation.Value;

public class DbmsSystem {
    @Value("${com.mycatgib.serverName}")
    private String serverName;
    @Value("${com.mycatgib.serverPort}")
    private int serverPort;
    @Value("${com.mycatgib.serverUrl}")
    private String serverUrl;
    @Value("${com.mycatgib.connectionCount}")
    private int connectionCount;

    public DbmsSystem() {
    }

    public DbmsSystem(String serverName, int serverPort, String serverUrl, int connectionCount) {
        this.serverName = serverName;
        this.serverPort = serverPort;
        this.serverUrl = serverUrl;
        this.connectionCount = connectionCount;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(int connectionCount) {
        this.connectionCount = connectionCount;
    }

    @Override
    public String toString() {
        return "DbmsSystem{" +
                "serverName='" + serverName + '\'' +
                ", serverPort=" + serverPort +
                ", serverUrl='" + serverUrl + '\'' +
                ", connectionCount=" + connectionCount +
                '}';
    }
}

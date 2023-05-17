package com.mycatgib.springstudy.di.basic5;

public class DmlServer {
          private StateServer stateServer;

          public DmlServer() {
          }

          public DmlServer(StateServer stateServer) {
                    this.stateServer = stateServer;
          }

          public StateServer getStateServer() {
                    return stateServer;
          }

          public void setStateServer(StateServer stateServer) {
                    this.stateServer = stateServer;
          }

          @Override
          public String toString() {
                    return "DmlServer{" +
                            "stateServer=" + stateServer +
                            '}';
          }
}

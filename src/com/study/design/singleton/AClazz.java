package com.study.design.singleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz() {
        // 생성 불가, 기본생성자를 private으로 막아 놨기 때문.
//        this.socketClient = new SocketClient();

        this.socketClient = SocketClient.getInstance();

    }

    //
    public SocketClient getSocketClient() {
       return this.socketClient;
    }

}

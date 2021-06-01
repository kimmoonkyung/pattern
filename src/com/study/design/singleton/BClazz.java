package com.study.design.singleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz() {
        // 생성 불가, 기본생성자를 private으로 막아 놨기 때문.
//        this.socketClient = new SocketClient();

        this.socketClient = SocketClient.getInstance();
    }

    //
    public SocketClient getSocketClient() {
        return this.socketClient;
    }

}

package com.study.design.singleton;

public class SocketClient {

    // 싱글톤은 자기 자신을 객체로 가지고 있어야 한다.
    private static SocketClient socketClient = null;

    // 기본생성자를 private으로 막는다.
    public SocketClient() {

    }

    // static 메소드를 통해서 getInstance 메소드를 제공한다.
    public static SocketClient getInstance() {
        // 현재 내가 가진 객체가 null인지 체크
        if(socketClient == null){
            // null 이면 신규로 생성해서 리턴해준
            socketClient = new SocketClient();
        }
        // null이 아니면 그대로 리턴해줌.
        return socketClient;
    }

    public void connect() {
        System.out.println("singleton connect");
    }


}

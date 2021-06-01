package com.study.design;

import com.study.design.singleton.AClazz;
import com.study.design.singleton.BClazz;
import com.study.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        // 객체 비교, equals 사용
        System.out.println("객체 비교 : ");
        System.out.println(aClient.equals(bClient));
//        객체 비교 : 싱글톤(private)
//        true

//        객체 비교 : public
//        false

        // 정리 : 어떠한 객체가 유일하게 1개만 존재해야 된다라면 싱글톤패턴을 사용하여 작성한다.

    }

}

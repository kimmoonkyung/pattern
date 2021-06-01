package com.study.design;

import com.study.design.adapter.*;
import com.study.design.aop.AopBrowser;
import com.study.design.proxy.Browser;
import com.study.design.proxy.BrowserProxy;
import com.study.design.proxy.IBrowser;
import com.study.design.singleton.AClazz;
import com.study.design.singleton.BClazz;
import com.study.design.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () ->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    System.out.println("after");
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

/*//        Browser browser = new Browser("www.naver.com");
//        browser.show();
        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();*/

       /* AClazz aClazz = new AClazz();
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

        // 싱글톤 정리 : 어떠한 객체가 유일하게 1개만 존재해야 된다라면 싱글톤패턴을 사용하여 작성한다.
*/

/*        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        // connect(cleaner); // 220V를 110V에 연결하여 문제가 생김

        // 어댑터를 사왔다.
        Electronic110V hairDryerAdapter = new SocketAdapter(cleaner);
        // 어댑터를 통해 청소기를 연결
        connect(hairDryerAdapter);

        AirConditioner airConditioner = new AirConditioner();
        // connect(airConditioner); 에어컨이 220V 라 연결 안됨

        Electronic110V airConAdapter = new SocketAdapter(airConditioner);
        connect(airConAdapter);*/



    }

    // 우리집 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }

}

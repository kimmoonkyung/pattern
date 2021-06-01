package com.study.design.proxy;

public class Browser implements IBrowser {

    private String url;

    public Browser(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("BROWSER LOADING HTML FORM : " + url);
        return new Html(url);
    }

}

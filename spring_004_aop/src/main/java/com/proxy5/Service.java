package com.proxy5;

public interface Service {
    //规定业务功能
    void buy();
    //增加有参数有返回的方法，测试代理功能
    default String show(int age){
        return null;
    };
}

package com.proxy4;

public class LogAop implements AOP {
    public void before(){
        System.out.println("前置日志输出........");
    }

}
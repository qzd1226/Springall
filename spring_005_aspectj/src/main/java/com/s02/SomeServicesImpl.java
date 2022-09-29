package com.s02;

import org.springframework.stereotype.Component;

@Component("service")
public class SomeServicesImpl implements SomeServices{

    @Override
    public String doSome(String name, int age) {
        System.out.println("执行doSome方法");
        return "abcd";
    }

    @Override
    public int show() {
        System.out.println("执行show方法");
        return 0;
    }
    @Override
    public  Student change(){
        System.out.println("change方法被执行");
        return new Student("qzd", 19);
    }
}

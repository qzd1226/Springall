package com.s01;
// 业务实现类
public class SomeServicesImpl implements SomeServices{
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome 的业务功能实现");
        return "abcd";
    }
    @Override
    public void show(){
        System.out.println("show的方法被执行........");
    }
}

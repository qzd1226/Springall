package com.proxy5;

//目标对象：业务功能的具体实现
public class BookServiceImpl implements Service {
    @Override
    public void buy() {
        System.out.println("图书购买业务功能的实现...........");
    }
    @Override
    public String show(int age){
        System.out.println("这是show方法被调用....." + age);
        return "abcd";
    }
}

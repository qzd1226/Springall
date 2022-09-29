package com.proxy4;

//目标对象：业务功能的具体实现
public class BookServiceImpl implements Service {
    @Override
    public void buy() {
        System.out.println("图书购买业务功能的实现...........");
    }
}

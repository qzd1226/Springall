package com.proxy2;
//使用子类代理的方式进行业务和事务切面的拆分
public class BookServiceImpl {
    //在父类中只有干净的业务
    public void buy(){
        System.out.println("图书购买功能的实现..........");
    }
}

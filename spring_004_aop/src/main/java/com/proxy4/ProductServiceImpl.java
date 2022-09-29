package com.proxy4;

public class ProductServiceImpl implements Service {
    @Override
    public void buy() {
        System.out.println("执行购买商品的业务");
    }
}

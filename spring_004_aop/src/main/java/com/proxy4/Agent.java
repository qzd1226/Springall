package com.proxy4;

public class Agent implements Service{
    //传入业务对象和切面你对象
    Service target;
    AOP aop;

    //使用构造方法初始化业务对象和切面对象呢
    public Agent(AOP aop, Service target){
        this.aop = aop;
        this.target = target;
    }
    @Override
    public void buy() {
        try {
            aop.before();
            target.buy();
            aop.after();
        } catch (Exception e) {
            aop.exception();
        }
    }
}

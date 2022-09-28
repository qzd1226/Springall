package com.proxy2;

//子类就是代理类， 将父类的图书购买功能添加事务的切面
public class SubBookServiceImpl extends BookServiceImpl{

    @Override
    public void buy(){
        try{
            //事务切面
            System.out.println("事务的开始........");
            //主业务的实现
            super.buy();
            //事务的切面
            System.out.println("事务的提交......");
        }catch (Exception e){
            System.out.println("事务的回滚......");
        }
    }

}

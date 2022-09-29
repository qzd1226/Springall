package com.proxy5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static Object getAgent(Service target, AOP aop){
        // 返回生成的动态代理对象
        return Proxy.newProxyInstance(
                //类加载器
                target.getClass().getClassLoader(),
                //目标对象实现的所有接口
                target.getClass().getInterfaces(),
                //代理功能实现
                new InvocationHandler() {
                    @Override
                    public Object invoke(
                            //生成的代理对象
                            Object proxy,
                            //正在被调用的目标方法 buy(), show()
                            Method method,
                            //目标方法的参数
                            Object[] args) throws Throwable {
                        //切面
                        Object object = null;
                        try {
                            aop.before(); // 事务
                            //业务
                            object = method.invoke(target,args);
                            //切面
                            aop.after();
                        } catch (IllegalAccessException e) {
                            aop.exception();
                        }
                        return object; // 返回目标方法的返回值
                    }
                }
        );
    }
}

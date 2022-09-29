package com.s04;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    /**
     *
     * 最终通知方法的规范
     *  访问权限public
     *  方法没有返回值
     *  方法名称自定义
     *  方法没有参数 如果有只能是JoinPoint
     *  使用@After注解 表明是最终通知
     *  参数:
     *      value:切入点表达式
     */
    @After(value = "execution(* com.s04.*.*(..))")
    public void myAfter(){
        System.out.println("最终通知.......");
    }
}

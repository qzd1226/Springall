package com.s04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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

    @Before(value = "execution(* com.s04.*.*(..))")
    public void myBefore(){
        System.out.println("前置通知执行.......");
    }
    @Before(value = "execution(* com.s04.*.*(..))")
    public void myBefore2(){
        System.out.println("前置通知2执行.......");
    }

    @AfterReturning(value = "execution(* com.s04.*.*(..))", returning = "obj")
    public void myAfterReturning(Object obj){
        System.out.println("后置通知执行.......");
    }

    @Around(value = "execution(* com.s04.*.*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知的前置通知执行.......");
        Object obj = pjp.proceed(pjp.getArgs());
        System.out.println("环绕通知的后置通知执行.......");
        return obj;
    }

}

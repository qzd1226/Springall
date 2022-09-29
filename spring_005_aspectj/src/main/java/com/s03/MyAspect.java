package com.s03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Aspect
@Component
public class MyAspect {
    /**
     * 环绕通知方法的规范
     *  访问权限public
     *  切面方法有返回值 此返回值就是目标方法的返回值
     *  方法名称自定义
     *  切面方法有参数 此参数就是目标方法
     *  回避异常
     *  使用@Around声明是环绕通知
     *  参数 :
     *      value; 切入点表达式
     *
     */
    @Around(value = "execution(* com.s03.*.*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        //前切功能实现
        System.out.println("环绕通知中的前置通知实现...........");
        //目标方法调用
        Object obj = pjp.proceed(pjp.getArgs());
        //后切功能实现
        System.out.println("环绕通知中的后置通知实现...........");
        return obj.toString().toUpperCase(); // 改变了目标方法的返回值
    }
}

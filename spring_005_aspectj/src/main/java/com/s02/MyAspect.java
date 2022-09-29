package com.s02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class MyAspect {
    // 后置通知方法的规范
    // 访问权限是public
    // 方法没有返回值
    // 方法名称自定义
    // 方法有参数（也可以没有参数，如果目标方法没有返回值，则可以写无参数的方法， 但一般都会写有参，因为这样既可以处理有参的目标方法，也可以处理无参数的目标方法）
    // 切面方法的参数就是目标方法的返回值
    // 使用@AfterReturning 表明是后置通知
    //  value:指定切入点表达式  returning: 指定目标方法返回值的名称，此名称必须与目标方法返回值的名称一致
    @AfterReturning(value = "execution(* com.s02.*.*(..))", returning = "obj")
    public void myAfter(Object obj){
        System.out.println("后置通知功能实现");
        if(obj != null){
            if(obj instanceof String){
                obj = obj.toString().toUpperCase();
                System.out.println("在切面方法中目标方法的返回值" + obj);
            }
            if(obj instanceof  Student){
                Student stu = (Student) obj;
                stu.setName("李四");
                stu.setAge(22);
                System.out.println("在切面中修改为：" + stu.toString());
            }
        }
    }

}

package com.proxy5;

public interface AOP {
    // default 不强制实现类重写方法
    default void before(){};
    default void after(){};
    default void exception(){};
}

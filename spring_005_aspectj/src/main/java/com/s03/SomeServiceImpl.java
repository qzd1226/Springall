package com.s03;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService{

    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome业务被执行" + name);
        return "abcd";
    }

}

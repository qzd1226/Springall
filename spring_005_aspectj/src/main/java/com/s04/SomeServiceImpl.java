package com.s04;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService {

    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome业务被执行" + name);
        //System.out.println(1/0); // 添加一个报错
        return "abcd";
    }

}

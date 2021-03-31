package com.ouc.lwl.provider;

/**
 * @author Li Wenlong
 * @since 2021/3/31
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return  "Hello " + name;
    }
}

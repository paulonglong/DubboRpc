package com.ouc.lwl.consumer;

import com.ouc.lwl.framework.MyProxyFactory;
import com.ouc.lwl.provider.HelloService;

/**
 * @author Li Wenlong
 * @since 2021/3/31
 */
public class Consumer {
    public static void main(String[] args) {
        HelloService helloService = MyProxyFactory.getProxy(HelloService.class);
        System.out.println(helloService.sayHello("LockLock!"));
    }
}

package com.ouc.lwl.framework;

import com.ouc.lwl.protocol.http.HttpClientUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Li Wenlong
 * @since 2021/3/31
 */
public class MyProxyFactory {
    public static <T> T getProxy(final Class interfaceClass) {
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class[]{interfaceClass}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Invocation invocation = new Invocation(interfaceClass.getName(), method.getName(), method.getParameterTypes(), args);
                String result = HttpClientUtils.send("localhost", 8081, invocation);
                return result;
            }
        });
    }
}

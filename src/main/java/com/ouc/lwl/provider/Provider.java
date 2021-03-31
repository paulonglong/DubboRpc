package com.ouc.lwl.provider;

import com.ouc.lwl.framework.URL;
import com.ouc.lwl.protocol.http.HttpServer;
import com.ouc.lwl.register.LocalMapRegister;
import com.ouc.lwl.register.RemoteMapRegister;

/**
 * @author Li Wenlong
 * @since 2021/3/31
 */
public class Provider {
    public static void main(String[] args) {
        URL url = new URL("localhost", 8081);
        RemoteMapRegister.regist(HelloService.class.getName(), url);

        LocalMapRegister.regist(HelloService.class.getName(), HelloServiceImpl.class);

        // 启动Tomcat
        HttpServer httpServer = new HttpServer();
        httpServer.start("localhost",8081);
    }
}

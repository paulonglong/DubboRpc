package com.ouc.lwl.protocol.http;

import com.alibaba.fastjson.JSON;
import com.ouc.lwl.framework.Invocation;
import com.ouc.lwl.register.LocalMapRegister;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author Li Wenlong
 * @since 2021/3/31
 */
public class MyDispatcherServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 从请求中，取出对象的json传 即 反序列化对象
        try {
            Invocation invocation = JSON.parseObject(req.getInputStream(), Invocation.class);
            Class c = LocalMapRegister.getClass(invocation.getInterfaceName());
            Method m = c.getMethod(invocation.getMethod(), invocation.getParamTypes());
            Object result = m.invoke(c.newInstance(), invocation.getParams());
            IOUtils.write((String) result, resp.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}

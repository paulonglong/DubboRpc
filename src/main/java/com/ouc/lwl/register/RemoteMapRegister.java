package com.ouc.lwl.register;

import com.ouc.lwl.framework.URL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Li Wenlong
 * @since 2021/3/31
 */
public class RemoteMapRegister {
    private static Map<String, List<URL>> REGISTER = new HashMap<>();

    public static void regist(String key, URL url) {
        List<URL> urls = REGISTER.get(key);
        if (null == urls) {
            urls = new ArrayList<>();
        }
        urls.add(url);
        REGISTER.put(key, urls);
    }

    public static List<URL> getUrls(String key) {
        return REGISTER.get(key);
    }
}

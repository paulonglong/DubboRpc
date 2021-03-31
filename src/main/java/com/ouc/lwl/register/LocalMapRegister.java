package com.ouc.lwl.register;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Li Wenlong
 * @since 2021/3/31
 */
public class LocalMapRegister {
    private static Map<String, Class> LOCAL_REGISTER = new HashMap<>();

    public static void regist(String interfaceName, Class c) {
        LOCAL_REGISTER.put(interfaceName, c);
    }

    public static Class getClass(String interfaceName) {
        return LOCAL_REGISTER.get(interfaceName);
    }
}

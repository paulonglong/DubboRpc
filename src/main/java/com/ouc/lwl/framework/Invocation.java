package com.ouc.lwl.framework;

import lombok.Data;

/**
 * @author Li Wenlong
 * @since 2021/3/31
 */
@Data
public class Invocation {
    private String interfaceName;
    private String method;
    private Class[] paramTypes;
    private  Object[] params;

    public Invocation(){

    }

    public Invocation(String interfaceName, String method, Class[] paramTypes, Object[] params) {
        this.interfaceName = interfaceName;
        this.method = method;
        this.paramTypes = paramTypes;
        this.params = params;
    }
}

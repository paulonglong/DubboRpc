package com.ouc.lwl.framework;
import lombok.Data;
/**
 * @author Li Wenlong
 * @since 2021/3/31
 */
@Data
public class URL {
    private String serverName;
    private  int port;

    public URL(String serverName, int port) {
        this.serverName = serverName;
        this.port = port;
    }
}

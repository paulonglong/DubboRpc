package com.ouc.lwl.protocol.http;

import lombok.Data;

/**
 * @author Li Wenlong
 * @since 2021/3/31
 */
@Data
public class HttpClientConfig {

    /**
     * //连接超时时间(单位毫秒)
     */
    static int httpConnectTimeout = 10000;

    /**
     * //socket读写超时时间(单位毫秒)
     */
    static int httpSocketTimeout = 10000;

    static int httpMaxPoolSize = 100;

    static int httpMonitorInterval = 3000;

    static int httpIdelTimeout = 2000;

    public static int getHttpIdelTimeout() {
        return httpIdelTimeout;
    }

    public static int getHttpSocketTimeout() {
        return httpSocketTimeout;
    }

    public static int getHttpMaxPoolSize() {
        return httpMaxPoolSize;
    }

    public static int getHttpMonitorInterval() {
        return httpMonitorInterval;
    }

    public static int getHttpConnectTimeout() {
        return httpConnectTimeout;
    }
}
package com.ouc.lwl.protocol.http;

import com.alibaba.fastjson.JSONObject;
import com.ouc.lwl.framework.Invocation;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author Li Wenlong
 * @since 2021/3/31
 */
public class HttpClientUtils {
    public static String send(String hostName, int port, Invocation invocation) {
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(new URI("http", null, hostName, port, "/", null, null))
                    .POST(HttpRequest.BodyPublishers.ofString(JSONObject.toJSONString(invocation)))
                    .build();

            HttpClient httpClient = HttpClient.newHttpClient();

            HttpResponse<String> httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            return httpResponse.body();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

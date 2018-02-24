package com.keepsimplefocus.coin.common.utils.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/14
 * */
@AllArgsConstructor
public class SampleResponse {
    private int httpCode = -1;
    private String body = null;
    private Map<String, String> headers;

    public static SampleResponse toSimpleResponse(CloseableHttpResponse response)
        throws IOException {
        int httpCode = response.getStatusLine().getStatusCode();

        BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

        StringBuilder sb = new StringBuilder("");
        if (httpCode >= HttpCodeEnum.HTTPCODE_300.getHttpCode()) {
            sb.append(response.getStatusLine().getReasonPhrase());
        } else {
            String tmp = null;
            while ((tmp = br.readLine()) != null) {
                sb.append(tmp + "\n");
            }
        }

        Map<String, String> headers = new HashMap<String, String>(0);
        for (Header header : response.getAllHeaders()) {
            headers.put(header.getName(), header.getValue());
        }

        return new SampleResponse(httpCode, sb.toString(), headers);
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
}
package com.keepsimplefocus.coin.common.utils.http;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static com.keepsimplefocus.coin.common.utils.http.SampleResponse.toSimpleResponse;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/14
 * */
public class RestfulClient {

    private ResponseHandler<String> responseHandler = new BasicResponseHandler();

    public SampleResponse post(String uri, Map<String, String> headers, String body)
        throws IOException {
        HttpPost post = new HttpPost(uri);

        if (null != headers) {
            for (String key : headers.keySet()) {
                post.setHeader(key, headers.get(key));
            }
        }

        if (null != body) {
            StringEntity stringEntity = new StringEntity(body, "UTF-8");
            post.setEntity(stringEntity);
        }

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(post);
        SampleResponse ret = toSimpleResponse(response);
        httpClient.close();

        return ret;
    }

    public SampleResponse get(String uri, Map<String, String> headers) throws IOException {
        HttpGet get = new HttpGet(uri);
        if (headers != null) {
            for (String key : headers.keySet()) {
                get.setHeader(key, headers.get(key));
            }
        }
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(get);
        SampleResponse ret = toSimpleResponse(response);
        httpClient.close();

        return ret;
    }

    public SampleResponse get(String uri) throws IOException {
        return get(uri, null);
    }

    public SampleResponse put(String uri, Map<String, String> headers, String body) throws IOException {
        HttpPut put = new HttpPut(uri);
        if (null != headers) {
            for (String key : headers.keySet()) {
                put.setHeader(key, headers.get(key));
            }
        }

        if (null != body) {
            StringEntity stringEntity = new StringEntity(body);
            put.setEntity(stringEntity);
        }

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(put);
        SampleResponse ret = toSimpleResponse(response);
        httpClient.close();

        return ret;
    }

    public SampleResponse put(String uri, Map<String, String> headers, byte[] bodyInBytes) throws IOException {
        if (null == bodyInBytes) {
            String bodyInStr = null;
            return put(uri, headers, bodyInStr);
        } else {
            String bodyInStr = new String(bodyInBytes, StandardCharsets.UTF_8);
            return put(uri, headers, bodyInStr);
        }
    }

    public SampleResponse delete(String uri) throws IOException {
        HttpDelete delete = new HttpDelete(uri);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(delete);
        SampleResponse ret = toSimpleResponse(response);
        httpClient.close();

        return ret;
    }
}

package com.keepsimplefocus.coin.util.http;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/14
 */
public enum HttpCodeEnum {
    // OK
    HTTPCODE_200(200),
    // Created
    HTTPCODE_201(201),
    // Multiple Choices
    HTTPCODE_300(300),
    // Temporary Redirect
    HTTPCODE_307(307),
    // Bad Request
    HTTPCODE_400(400),
    // Unauthorized
    HTTPCODE_401(401),
    // Not Found
    HTTPCODE_404(404),
    // Conflict
    HTTPCODE_409(409),
    // Internal Server Error
    HTTPCODE_500(500);

    private int httpCode;

    private HttpCodeEnum(int httpCode) {
        this.httpCode = httpCode;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }
}

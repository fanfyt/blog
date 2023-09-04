package com.liang.blog.format;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class Resp extends ResponseEntity<Object> {

    private Object data;


    public Resp(HttpStatusCode status) {
        super(status);
    }

    public Resp(Object body, HttpStatusCode status) {
        super(body, status);
    }

    public Resp(MultiValueMap<String, String> headers, HttpStatusCode status) {
        super(headers, status);
    }

    public Resp(Object body, MultiValueMap<String, String> headers, HttpStatusCode status) {
        super(body, headers, status);
    }

    public Resp(Object body, MultiValueMap<String, String> headers, int rawStatus) {
        super(body, headers, rawStatus);
    }
}

package com.adozgen.sbdesignpatterns.builder.example2;

import lombok.Getter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import java.util.HashMap;
import java.util.Map;

@Getter
public class RestRequestConfiguration {
    private String url;
    private HttpMethod method;
    private HttpHeaders headers;
    private Map<String, String> queryParams;
    private Object body;

    // Özel Constructor
    private RestRequestConfiguration(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.queryParams = builder.queryParams;
        this.body = builder.body;
    }

    // Getter metodları

    // Builder sınıfı
    public static class Builder {
        private String url;
        private HttpMethod method = HttpMethod.GET; // Varsayılan HTTP metodu
        private HttpHeaders headers = new HttpHeaders();
        private Map<String, String> queryParams = new HashMap<>();
        private Object body;

        public Builder(String url) {
            this.url = url;
        }

        public Builder method(HttpMethod method) {
            this.method = method;
            return this;
        }

        public Builder addHeader(String key, String value) {
            this.headers.add(key, value);
            return this;
        }

        public Builder addQueryParam(String key, String value) {
            this.queryParams.put(key, value);
            return this;
        }

        public Builder body(Object body) {
            this.body = body;
            return this;
        }

        public RestRequestConfiguration build() {
            return new RestRequestConfiguration(this);
        }
    }
}


package com.santsg.bookingwebsite.entities.shared;

public class ApiResponse<T> {
    private T body;
    private Header header;

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }
}
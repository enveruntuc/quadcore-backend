package com.santsg.bookingwebsite.entities.models.nationalty;

import com.santsg.bookingwebsite.entities.shared.Header;
import com.santsg.bookingwebsite.entities.shared.Message;

import java.util.Collections;

public class NationalityRequest {
    private final Header header;

    public NationalityRequest() {

        Message message = new Message();
        message.setId(20000018);
        message.setCode("HttpRequestMethodNotSupported");
        message.setMessageType(1);
        message.setMessage("Http request 'GET' method not supported");

        Header header = new Header();
        header.setRequestId("e547d608-e7c6-4ba0-8c74-d760bbe00561");
        header.setSuccess(false);
        header.setResponseTime("2025-07-08T13:01:45.8897964Z");
        header.setMessages(Collections.singletonList(message));

        this.header = header;
    }

    public Header getHeader() {
        return header;
    }
}

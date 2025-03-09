package com.example.demo;

public class Message {
    private MessageType msgType;
    private Object msgBody;

    public Message(MessageType msgType, Object msgBody) {
        this.msgType = msgType;
        this.msgBody = msgBody;
    }

    public MessageType getMsgType() {
        return msgType;
    }

    public void setMsgType(MessageType msgType) {
        this.msgType = msgType;
    }

    public Object getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(Object msgBody) {
        this.msgBody = msgBody;
    }
}

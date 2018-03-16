package com.example.demo.concurrency.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    private String eventType;

    private Object data;

    public CustomEvent(Object source) {
        super(source);
    }

    public CustomEvent(Object source, Object data) {
        super(source);
        this.data = data;
    }

    public CustomEvent(Object source, String eventType, Object data) {
        super(source);
        this.eventType = eventType;
        this.data = data;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}

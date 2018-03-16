package com.example.demo.concurrency.event;

import com.example.demo.concurrency.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
@Component
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

    @Autowired
    private EventService eventService;

    //使用注解@Async支持 这样不仅可以支持通过调用，也支持异步调用，非常的灵活，
    @Async
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        //业务处理
        System.out.println("Listener data:");
        String eventType = customEvent.getEventType();
        if ("img".equals(eventType)) {
            eventService.test1(customEvent.getData());
        } else if ("location".equals(eventType)) {
            eventService.test2(customEvent.getData());
        } else if ("sms".equals(eventType)) {
            eventService.test3(customEvent.getData());
        } else if ("wx".equals(eventType)) {
            eventService.test4(customEvent.getData());
        }
    }


}

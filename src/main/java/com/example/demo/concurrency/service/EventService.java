package com.example.demo.concurrency.service;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    public void test1(Object data) {
        System.out.println("test1:" + data);
    }

    public void test2(Object data) {
        System.out.println("test2:" + data);
    }

    public void test3(Object data) {
        System.out.println("test3:" +  new Gson().toJson(data));
    }

    public void test4(Object data) {
        System.out.println("test4:" + data);
    }
}

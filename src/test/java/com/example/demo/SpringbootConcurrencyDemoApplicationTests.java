package com.example.demo;

import com.example.demo.concurrency.event.CustomEventPublisher;
import com.example.demo.concurrency.event.SmsInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootConcurrencyDemoApplicationTests {

	@Autowired
	private CustomEventPublisher customEventPublisher;

	@Test
	public void contextLoads() {
		customEventPublisher.publish("img","hello word");
		customEventPublisher.publish("location","hello word location");
		SmsInfo smsInfo=new SmsInfo();
		smsInfo.setFromName("123@qq.com");
		smsInfo.setToName("666@qq.com");
		smsInfo.setSubject("这个是标题");
		smsInfo.setContent("这是一条短信");
		customEventPublisher.publish("sms",smsInfo);
		customEventPublisher.publish("wx","发送微信");
	}

}

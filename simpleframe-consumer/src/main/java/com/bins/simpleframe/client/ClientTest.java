package com.bins.simpleframe.client;

import com.bins.simpleframe.api.SimpleFrameAPI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by songrongbin on 2016/12/19.
 */
public class ClientTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"spring/dubbo-consumer.xml"});
        context.start();
        SimpleFrameAPI simpleFrameAPI = (SimpleFrameAPI) context.getBean("simpleFrameAPI");
        System.out.println(simpleFrameAPI.getOrderCount(1l));
    }


}

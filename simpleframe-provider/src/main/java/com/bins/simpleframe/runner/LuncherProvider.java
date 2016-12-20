package com.bins.simpleframe.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by songrongbin on 2016/12/19.
 */
public class LuncherProvider {

    public static void main(String[] args) throws InterruptedException, IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                new String[] {
                        "spring/dubbo-provider.xml"
                });
        context.start();
        System.out.println("按任意键退出");
        System.in.read();

        /*LuncherProvider luncher = new LuncherProvider();
        luncher.start();
        Thread.sleep(1000 * 60 * 10);*/
    }

    void start() {
        String configLocation = "spring/dubbo-provider.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        String[] names = context.getBeanDefinitionNames();
        System.out.print("Beans:");
        for (String string : names)
            System.out.print(string + ",");
        System.out.println();
    }
}
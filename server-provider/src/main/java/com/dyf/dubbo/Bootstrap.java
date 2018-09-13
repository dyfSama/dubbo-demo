package com.dyf.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 发布服务
 */
public class Bootstrap {

    public static void main(String[] args) {

        //spring 加载配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-server.xml");

        context.start();
        System.out.println("provider started !");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

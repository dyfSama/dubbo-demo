package com.dyf.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerTest {

    public static void main(String[] args) {
        //加载配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-server.xml");

        //spring启动
        context.start();

        //获取服务
        for (int i = 0; i < 100; i++) {
            IHelloService helloService = (IHelloService) context.getBean("helloService");
            System.out.println("第 " + i + " 次调用---" + helloService.sayHello("哈哈哈"));
        }


        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

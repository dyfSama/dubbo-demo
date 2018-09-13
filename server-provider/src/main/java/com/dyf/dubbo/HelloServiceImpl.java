package com.dyf.dubbo;

public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String msg) {
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        return "hello dubbo1! " + msg;
    }
}

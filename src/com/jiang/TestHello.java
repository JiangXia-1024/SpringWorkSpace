package com.jiang;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
    @Test
    public void test(){
        // 1、读取配置文件实例化一个IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("helloword.xml");
        // 2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
        HelloService helloService = context.getBean("helloService",HelloService.class);
        // 3、执行业务逻辑
        helloService.say();
    }
}

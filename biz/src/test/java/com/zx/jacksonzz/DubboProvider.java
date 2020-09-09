package com.zx.jacksonzz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Name DubboProvider
 * @Description
 * @Date 2020/8/5 23:20
 * @Author Zhouzhi
 * @Version 1.0
 */
public class DubboProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:*ApplicationContext.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}

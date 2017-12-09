package com.bj58.lightrpc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jam
 * @date 2017/12/9
 */
public class RpcBootstrap {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("config/spring.xml");
    }
}

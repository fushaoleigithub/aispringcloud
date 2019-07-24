package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//此时这个工程就成为了注册中心
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

//    http://localhost:8761/访问测试网址
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}

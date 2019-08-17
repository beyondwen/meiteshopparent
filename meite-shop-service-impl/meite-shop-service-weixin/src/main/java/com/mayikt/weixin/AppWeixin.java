package com.mayikt.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppWeixin {

    public static void main(String[] args) {
        SpringApplication.run(AppWeixin.class, args);
    }
}

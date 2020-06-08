package com.wennuan.shop.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class CenterRegisApplication {
    public static void main(String[] args) {
        SpringApplication.run(CenterRegisApplication.class,args);
    }
}

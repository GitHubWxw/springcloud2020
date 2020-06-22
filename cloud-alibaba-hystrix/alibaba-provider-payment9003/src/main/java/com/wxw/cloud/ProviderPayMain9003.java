package com.wxw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: wxw
 * @create: 2020-06-22-23:56
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPayMain9003 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderPayMain9003.class, args);
    }

}
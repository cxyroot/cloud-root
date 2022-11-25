package com.google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AppPowerServer6000 {

    public static void main(String[] args) {
        SpringApplication.run(AppPowerServer6000.class);
    }
}

package com.xzh.cloud.configserver.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
//@EnableDiscoveryClient
//@SpringCloudApplication
public class CloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServerApplication.class, args);
    }

}

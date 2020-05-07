package com.kpioneer.eurekafeign;

import com.kpioneer.eurekafeign.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients(clients = StudentService.class) //指定API开启
@EnableDiscoveryClient
@SpringBootApplication
public class EurekafeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekafeignApplication.class, args);
    }

}

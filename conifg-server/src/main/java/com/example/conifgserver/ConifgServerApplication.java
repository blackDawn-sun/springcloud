package com.example.conifgserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConifgServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConifgServerApplication.class, args);
    }

}

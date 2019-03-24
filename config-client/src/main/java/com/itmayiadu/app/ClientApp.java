package com.itmayiadu.app;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableConfigServer
public class ClientApp {

    public static void main(String[] args) {
        SpringApplication.run(ClientApp.class, args);
    }
    @Value("${userName}")

    String userName;

    @RequestMapping(value = "/getUserName")
    public String getUserName () {
        return userName;
    }

}

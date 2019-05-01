package com.itmayiadu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderFeignApp {

	public static void main(String[] args) {
		SpringApplication.run(OrderFeignApp.class, args);
	}
}
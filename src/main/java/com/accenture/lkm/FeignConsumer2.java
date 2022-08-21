package com.accenture.lkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignConsumer2 {

	public static void main(String[] args){
		SpringApplication.run(FeignConsumer2.class, args);
	}
}
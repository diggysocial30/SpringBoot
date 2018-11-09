package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contxt = SpringApplication.run(DemoApplication.class, args);
		for(String beans :contxt.getBeanDefinitionNames()){
			System.out.println("***********"+beans);
		}
	}
}

package com.angular.angular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.angular.angular.*")
public class AngularApplication 
{

	public static void main(String[] args) 
	{
		System.out.println("in main");
		SpringApplication.run(AngularApplication.class, args);
		System.out.println("in main");
	}

}

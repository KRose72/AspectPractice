package com.grangeinsurance.aspectpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectpracticeApplication.class, args);
	}

}

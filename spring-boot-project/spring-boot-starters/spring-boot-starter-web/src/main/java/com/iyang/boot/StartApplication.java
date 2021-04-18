package com.iyang.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @project : spring-boot-build
 * @auhtor : luohong
 * @since : 2021/4/18
 */

@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
				SpringApplication.run(StartApplication.class, args);


	}

}

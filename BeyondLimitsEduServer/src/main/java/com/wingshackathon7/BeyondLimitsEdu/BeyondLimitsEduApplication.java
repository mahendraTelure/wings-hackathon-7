package com.wingshackathon7.BeyondLimitsEdu;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.wingshackathon7.BeyondLimitsEdu")
public class BeyondLimitsEduApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeyondLimitsEduApplication.class, args);
	}

}

package com.example.reservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableBinding(Processor.class)
public class ReservationApplication {
	static ApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(ReservationApplication.class, args);
	}

}

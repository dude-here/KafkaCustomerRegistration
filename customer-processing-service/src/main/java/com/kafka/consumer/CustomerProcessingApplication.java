package com.kafka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CustomerProcessingApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                CustomerProcessingApplication.class,
                args);
    }
}
package com.example.eventstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EventsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventsTestApplication.class, args);
    }

}

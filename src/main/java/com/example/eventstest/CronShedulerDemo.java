package com.example.eventstest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CronShedulerDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(CronShedulerDemo.class);
    @Scheduled(cron = "*/10 * * * * *")
    public void timeWithCron(){
        LOGGER.info("Hello each ten seconds {}", LocalDateTime.now());
    }

}

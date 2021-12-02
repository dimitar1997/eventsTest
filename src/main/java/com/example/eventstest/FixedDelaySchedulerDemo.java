package com.example.eventstest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class FixedDelaySchedulerDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(FixedDelaySchedulerDemo.class);
private int numDelay;
    @Scheduled(fixedDelay = 30000, initialDelay = 20000)
    public void showTimeWithDelay() {
        numDelay++;
        LOGGER.info("This is fixed delay at {} local time and numbers delays " + numDelay, LocalDateTime.now());
    }
}

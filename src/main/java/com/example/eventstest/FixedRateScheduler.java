package com.example.eventstest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class FixedRateScheduler {
    public static final Logger LOGGER = LoggerFactory.getLogger(FixedRateScheduler.class);

    @Scheduled(fixedRate = 60000)
    public void fixedRate() {
        LOGGER.info("This fixed rate execute at {}", LocalDateTime.now());
    }
}

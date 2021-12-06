package com.example.eventstest.AplicationListereTset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ProductQuantityCalculator {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductQuantityCalculator.class);

    @EventListener(OrderCreatedEvent.class)
    public void orderCreated(OrderCreatedEvent orderCreatedEvent) {
        LOGGER.info("Order no {} has been created. I`m going calculate  the current product quantities ", orderCreatedEvent.getOrderId());
    }
    // todo
}

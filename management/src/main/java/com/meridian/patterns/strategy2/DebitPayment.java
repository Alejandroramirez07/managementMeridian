package com.meridian.patterns.strategy2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DebitPayment implements PaymentStrategy{
    private static final Logger LOGGER = (Logger) LogManager.getLogger(DebitPayment.class);

    @Override
    public void pay(int cost) {
        LOGGER.info("Paid via debit the amount of " + cost);
    }
}

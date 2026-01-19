package com.meridian.patterns.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmailMessage implements Message{
    private static final Logger LOGGER = (Logger) LogManager.getLogger(EmailMessage.class);

    @Override
    public void MessageUser() {
        LOGGER.info("This is an email");

    }
}

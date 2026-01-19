package com.meridian.patterns.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SMSMessage implements Message {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(SMSMessage.class);

    @Override
    public void MessageUser() {
        LOGGER.info("This is a SMS Message");
    }
}

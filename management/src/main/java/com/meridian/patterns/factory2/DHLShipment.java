package com.meridian.patterns.factory2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DHLShipment implements Shipping{
    private static final Logger LOGGER = (Logger) LogManager.getLogger(DHLShipment.class);

    @Override
    public void shipToUser(){
        LOGGER.info("Shipment made via DHL");
    }

}

package com.meridian.patterns.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TruckFacade {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(TruckFacade.class);

    private Motor motor = new Motor();
    private Tires tires = new Tires();

    public void startTruck(){
        motor.start();
        tires.start();
        LOGGER.info("Starting truck for shipping");
    }
}


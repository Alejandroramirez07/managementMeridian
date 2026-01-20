package com.meridian.patterns.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GovernmentLicensing implements LicensingStrategy {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(GovernmentLicensing.class);


    @Override
    public void license(double cost) {
        LOGGER.info("License via Government with cost " + cost);
    }
}

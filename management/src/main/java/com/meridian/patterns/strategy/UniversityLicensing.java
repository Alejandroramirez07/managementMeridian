package com.meridian.patterns.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class UniversityLicensing implements LicensingStrategy {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(UniversityLicensing.class);

    @Override
    public void license(double cost) {
        LOGGER.info("Licensed via University with cost " + cost);
    }
}

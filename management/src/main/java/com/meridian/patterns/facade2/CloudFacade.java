package com.meridian.patterns.facade2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CloudFacade {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(CloudFacade.class);

    private AWS aws = new AWS();
    private Azure azure = new Azure();

    public void startMultiCloud() {
        LOGGER.info("MultiCloudService starting");
    }
}

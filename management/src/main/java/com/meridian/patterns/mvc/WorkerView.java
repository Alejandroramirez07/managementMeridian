package com.meridian.patterns.mvc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WorkerView {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(WorkerView.class);

    public void showWorkerDetails(String jobId, String name, int experience){
        LOGGER.info("---Worker record---");
        LOGGER.info("Worker with id " + jobId + ", name " + name + " and years of experience " + experience);

    }
}

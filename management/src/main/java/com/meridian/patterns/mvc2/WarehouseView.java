package com.meridian.patterns.mvc2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WarehouseView {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(WarehouseView.class);

    public void showWarehouseDetails(String addressWarehouse, int employeesWarehouse){
        LOGGER.info("---Warehouse details---");
        LOGGER.info("Warehouse located at " + addressWarehouse + " with a number of assignated employees of " + employeesWarehouse);
    }
}

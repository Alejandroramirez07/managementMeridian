package com.meridian.patterns.decorator;

public class SimpleShipment implements ShipmentCost {

    @Override
    public double getShipmentCost() {
        return 50;
    }
}

package com.meridian.patterns.decorator;

public class AssuranceDecorator implements ShipmentCost {

    private ShipmentCost shipmentCost;

    public AssuranceDecorator (ShipmentCost shipmentCost){
        this.shipmentCost=shipmentCost;
    }


    @Override
    public double getShipmentCost() {
        return shipmentCost.getShipmentCost() + 10;
    }
}

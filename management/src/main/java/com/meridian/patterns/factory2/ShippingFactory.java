package com.meridian.patterns.factory2;

public class ShippingFactory {


    public Shipping createShipping(String type){
        if (type.equals("FedEx")){
            return new FedExShipping();
        } else if (type.equals("DHL")){
            return new DHLShipment();
        }
        return null;
    }
}

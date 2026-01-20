package com.meridian.patterns.decorator2;

public class CertificationDecorator implements Training {

    private Training training;

    public CertificationDecorator(Training training){
        this.training= training;
    }

    @Override
    public double getTrainingCost() {
        return training.getTrainingCost()+100;
    }
}

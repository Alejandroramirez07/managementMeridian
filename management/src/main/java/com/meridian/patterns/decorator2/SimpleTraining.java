package com.meridian.patterns.decorator2;

public class SimpleTraining implements Training {

    @Override
    public double getTrainingCost() {
        return 1000;
    }
}

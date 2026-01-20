package com.meridian.patterns.strategy;

public class LicenseCourse {
    private LicensingStrategy licensingStrategy;

    public void setLicenseCourse(LicensingStrategy licensingStrategy){
        this.licensingStrategy=licensingStrategy;
    }

    public void completionCourse(double cost){
        licensingStrategy.license(cost);
    }

}

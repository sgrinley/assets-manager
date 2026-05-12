package com.pluralsight;

public class Vehicle extends Asset {

    //    Add Data Fields
    private String makeModel;
    private int year;
    private int odometer;

    //   Generate Constructor
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

}

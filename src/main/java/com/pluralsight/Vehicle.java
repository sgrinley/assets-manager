package com.pluralsight;

public class Vehicle extends Asset {

    //    Add Data Fields
    private String makeModel;
    private int year;
    private int odometer;

    //    Generate Constructor
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    //   Generate Getters
    public String getMakeModel() {
        return makeModel;
    }
    public int getYear() {
        return year;
    }
    public int getOdometer() {
        return odometer;
    }

    //    Generate Setters
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}

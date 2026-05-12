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

    @Override
    public double getValue() {

        int currentYear = 2026;
        int age = currentYear - year;

        double value = getOriginalCost();

        // Depreciation
        if (age <= 3) {
            value -= value * (0.03 * age);

        } else if (age <= 6) {
            value -= value * (0.06 * age);

        } else if (age <= 10) {
            value -= value * (0.08 * age);

        } else {
            value = 1000;
        }

        // Mileage reduction
        if (odometer > 100000 &&
                !makeModel.contains("Honda") &&
                !makeModel.contains("Toyota")) {

            value -= value * 0.25;
        }

        return value;
    }
}

package com.pluralsight;

public class Asset {

    //    Add Data Fields
    private String description;
    private String dateAcquired;
    private double originalCost;



    //    Generate Constructor

    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    //    Generate Getters
    public String getDescription() {
        return description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }
}

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

}

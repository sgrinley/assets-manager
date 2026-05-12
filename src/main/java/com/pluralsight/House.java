package com.pluralsight;

public class House extends Asset {

    //    Add Data Fields
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    //    Generate Constructor & Add Properties
    public House(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);

        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }


}

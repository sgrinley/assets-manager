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

    //    Generate Getters
    public String getAddress() {
        return address;
    }
    public int getCondition() {
        return condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    //    Generate Setters
    public void setAddress(String address) {
        this.address = address;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }


}

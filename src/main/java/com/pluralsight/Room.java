package com.pluralsight;

public class Room {
    private boolean isDirty;
    private int numOfBeds;
    private boolean isOccupied;
    private boolean isAvailable;
    private double price;

    public Room(boolean isDirty, int numOfBeds, boolean isOccupied, boolean isAvailable, double price) {
        this.isDirty = isDirty;
        this.numOfBeds = numOfBeds;
        this.isOccupied = isOccupied;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getPrice() {
        return price;
    }
}

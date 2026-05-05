package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, double price, int numOfNight, boolean isWeekend) {
        this.roomType = roomType;
        this.price = price;
        this.numOfNights = numOfNight;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
        if (roomType.equalsIgnoreCase("king")){
            this.price = 139.00;
        }else if (roomType.equalsIgnoreCase("double")){
            this.price = 124.00;
        }
    }

    public double getPrice() {
        return price;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal(){
        if (isWeekend){
            this.price *= 1.1;
        }
        return this.price * this.numOfNights;
    }
}

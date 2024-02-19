package com.n11.cohortshafta2.entity;

public class House extends ResidentialProperty {

    public House(double price, int area, int numberOfRooms, int numberOfLivingRooms) {
        super(price, area, numberOfRooms, numberOfLivingRooms);
    }

    @Override
    public String toString() {
        return "House" + super.toString();
    }
}

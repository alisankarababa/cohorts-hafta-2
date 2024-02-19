package com.n11.cohortshafta2.entity;

public class Villa extends ResidentialProperty{

    public Villa(double price, int area, int numberOfRooms, int numberOfLivingRooms) {
        super(price, area, numberOfRooms, numberOfLivingRooms);
    }

    @Override
    public String toString() {
        return "Villa" + super.toString();
    }
}

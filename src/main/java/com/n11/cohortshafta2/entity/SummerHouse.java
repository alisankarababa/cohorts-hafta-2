package com.n11.cohortshafta2.entity;

public class SummerHouse extends ResidentialProperty {

    public SummerHouse(double price, int area, int numberOfRooms, int numberOfLivingRooms) {
        super(price, area, numberOfRooms, numberOfLivingRooms);
    }

    @Override
    public String toString() {
        return "SummerHouse" + super.toString();
    }
}

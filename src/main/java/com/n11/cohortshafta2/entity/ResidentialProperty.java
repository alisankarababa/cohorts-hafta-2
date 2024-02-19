package com.n11.cohortshafta2.entity;

public abstract class ResidentialProperty {

    private final double price;
    private final int area;
    private final int numberOfRooms;
    private final int numberOfLivingRooms;

    public ResidentialProperty(double price, int area, int numberOfRooms, int numberOfLivingRooms) {
        this.price = price;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public double getPrice() {
        return price;
    }

    public int getArea() {
        return area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    @Override
    public String toString() {
        return "{" +
                "price=" + price +
                ", area=" + area +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfLivingRooms=" + numberOfLivingRooms +
                '}';
    }
}

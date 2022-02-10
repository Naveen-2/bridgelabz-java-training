package com.workshop2;

public class Truck extends Car{
    int weight;

    public double getSalePrice() {
        double salePrice;
        if(weight > 2000)
            salePrice = super.getSalePrice() * 0.90;
        else
            salePrice = super.getSalePrice() * 0.80;
        return salePrice;
    }

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
}

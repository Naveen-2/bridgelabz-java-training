package com.workshop2;

public class Sedan extends Car{
    int length;
    double getSalePrice(){
        double salePrice;
        if (length > 20)
            salePrice = super.getSalePrice() * 0.95;
        else
            salePrice = super.getSalePrice() * 0.90;
        return salePrice;
    }
    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }
}

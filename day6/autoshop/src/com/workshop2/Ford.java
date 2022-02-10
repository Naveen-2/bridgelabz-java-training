package com.workshop2;

public class Ford extends Car{
    int year;
    int manufacturerDiscount;
    double getSalePrice(){
        return super.getSalePrice() - manufacturerDiscount;
    }
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
}

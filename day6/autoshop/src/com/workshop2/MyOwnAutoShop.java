package com.workshop2;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        System.out.println("Workshop 2: Creating a My Own Auto Shop");

        Truck truck = new Truck(80,800000,"Blue",1800);
        Sedan sedan = new Sedan(120,1000000,"Red",17);
        Ford ford = new Ford(150,600000,"Black",2003,40000);
        Car car = new Car(100,500000,"White");

        System.out.println("\nTruck\nSpeed: " + truck.speed + "\nPrice: " + truck.getSalePrice() + "\nColor: " + truck.color);
        System.out.println("\nSedan\nSpeed: " + sedan.speed + "\nPrice: " + sedan.getSalePrice() + "\nColor: " + sedan.color);
        System.out.println("\nFord\nSpeed: " + ford.speed + "\nPrice: " + ford.getSalePrice() + "\nColor: " + ford.color);
        System.out.println("\nCar\nSpeed: " + car.speed + "\nPrice: " + car.getSalePrice() + "\nColor: " + car.color);

    }
}

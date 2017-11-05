package com.udemy.inheritance;

public class Vehicle {

    private String brand;
    private String model;
    private int modelYear;
    private String color;

    public Vehicle(String brand, String model, int modelYear, String color) {
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.color = color;
    }

    public void move(int velocity){
        System.out.println("You are moving at speed of " + velocity + " km/h");
    }
}

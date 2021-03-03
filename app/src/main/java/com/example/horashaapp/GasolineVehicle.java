package com.example.horashaapp;

public class GasolineVehicle extends Vehicle {

    private int fuel;

    public GasolineVehicle(String manufacturer, int fuel) {
        this.manufacturer = manufacturer;
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void addFuel(int quantity) {
        this.fuel += quantity;
    }

}

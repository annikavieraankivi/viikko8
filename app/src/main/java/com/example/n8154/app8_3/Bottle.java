package com.example.n8154.app8_3;

public class Bottle {
    private String name;
    private String brand;
    private double energy;
    private double size;
    private double price;

    public Bottle() {
        name = "Pepsi Max";
        brand = "Pepsi";
        energy = 0.3;
        size = 0.5;
        price = 1.8;
    }

    public Bottle (String n, String b, double e, double s, double p) {
        name = n;
        brand = b;
        energy = e;
        size = s;
        price = p;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getEnergy() {
        return energy;
    }

    public double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }
}

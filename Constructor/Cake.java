package com.constructors;

public class Cake {
    public String flavor;
    private double quantityInKg;
    private int price;

    public Cake(String flavor, double quantityInKg, int price) {
        this.flavor = flavor;
        this.quantityInKg = quantityInKg;
        this.price = price;
    }

    public Cake() {
        this("mango", 1.5, 100);
    }

}

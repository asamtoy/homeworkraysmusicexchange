package com.example.andrewsamtoy.raysmusicexchange;

/**
 * Created by andrewsamtoy on 9/9/17.
 */

public abstract class Instrument {
    String brand;
    String play;
    String material;
    String type;
    public double buyingPrice;
    public double sellingPrice;

    public Instrument(String brand) {
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

}

package com.example.andrewsamtoy.raysmusicexchange;

/**
 * Created by andrewsamtoy on 9/9/17.
 */

public abstract class Accessory {
    public String name;
    public double buyingPrice;
    public double sellingPrice;

    public Accessory(String name, double sellingPrice, double buyingPrice) {
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String getName() {
        return this.name;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}

package com.example.andrewsamtoy.raysmusicexchange;

/**
 * Created by andrewsamtoy on 9/9/17.
 */

public class GuitarPicks extends Accessory implements Sellable {

    public GuitarPicks(String brand, double buyingPrice, double sellingPrice) {
        super(brand, sellingPrice, buyingPrice);

    }

    @Override
    public double buyingPrice() {
        return 0.05;
    }

    @Override
    public double sellingPrice() {
        return 0.25;
    }
}
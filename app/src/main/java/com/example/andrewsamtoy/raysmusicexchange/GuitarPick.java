package com.example.andrewsamtoy.raysmusicexchange;

/**
 * Created by andrewsamtoy on 9/9/17.
 */

public class GuitarPick extends Accessory implements Sellable {

    public GuitarPick(String name, double buyingPrice, double sellingPrice) {
        super(name, sellingPrice, buyingPrice);

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
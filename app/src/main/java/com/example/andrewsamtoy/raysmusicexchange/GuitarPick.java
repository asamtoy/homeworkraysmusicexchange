package com.example.andrewsamtoy.raysmusicexchange;

/**
 * Created by andrewsamtoy on 9/9/17.
 */

public class GuitarPick extends Accessory implements Sellable {

    private GuitarPick(String name, double buyingPrice, double sellingPrice) {
        super(name, sellingPrice, buyingPrice);

    }

    @Override
    public String brand() {
        return brand();
    }

    @Override
    public double buyingPrice() {
        return buyingPrice;
    }

    @Override
    public double sellingPrice() {
        return sellingPrice;
    }
}
package com.example.andrewsamtoy.raysmusicexchange;

/**
 * Created by andrewsamtoy on 9/9/17.
 */

public class GuitarStrings extends Accessory implements Sellable {

    public GuitarStrings(String name, double buyingPrice, double sellingPrice) {
        super(name, sellingPrice, buyingPrice);

    }


    @Override
    public double buyingPrice() {
        return buyingPrice();
    }

    @Override
    public double sellingPrice() {
        return sellingPrice();
    }
}

package com.example.andrewsamtoy.raysmusicexchange;

/**
 * Created by andrewsamtoy on 9/9/17.
 */

public class Harp extends Instrument implements Playable, Sellable {
    public Harp(String brand, double buyingPrice, double sellingPrice) {
        super(brand);
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String play() {
        return "Heavenly Progression";
    }

    @Override
    public double buyingPrice() {
        return 0;
    }

    @Override
    public double sellingPrice() {
        return 0;
    }
}

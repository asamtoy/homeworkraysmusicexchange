package com.example.andrewsamtoy.raysmusicexchange;

/**
 * Created by andrewsamtoy on 9/9/17.
 */

public class Guitar extends Instrument implements Playable, Sellable {
    public Guitar(String brand, double buyingPrice, double sellingPrice) {
        super(brand);
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }
    
    public String play() {
        return "Strum";
    }

    @Override
    public String brand() {
        return brand;
    }

    @Override
    public double buyingPrice() {
        return buyingPrice;
    }

    @Override
    public double sellingPrice() {
        return sellingPrice;
    }

//    @Override
//    public double markup() {
//        return 0;
//    }
}

package com.example.andrewsamtoy.raysmusicexchange;

/**
 * Created by andrewsamtoy on 9/9/17.
 */

public class Piano extends Instrument implements Playable {
    public Piano(String brand, double buyingPrice, double sellingPrice) {
        super(brand);
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;

    }
    public String play() {
        return "Chord";
    }
}

package com.example.andrewsamtoy.raysmusicexchange;

import java.util.ArrayList;

/**
 * Created by andrewsamtoy on 9/10/17.
 */

public class Shop implements Sellable {
    private ArrayList<Sellable> stock;
    private double balance;

    public Shop(){
        this.balance = 1000.00;
        stock = new ArrayList<>();
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



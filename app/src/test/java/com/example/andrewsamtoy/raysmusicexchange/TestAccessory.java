package com.example.andrewsamtoy.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Parameter;

import static junit.framework.Assert.assertEquals;

/**
 * Created by andrewsamtoy on 9/9/17.
 */

public class TestAccessory {

    GuitarPick guitarpick;
    GuitarStrings guitarStrings;


    @Before
    public void before() {
        guitarpick = new GuitarPick("Dunlop", 0.05, 0.25);
        guitarStrings = new GuitarStrings("Dadario", 1.0, 5.0);

    }

    @Test
    public void guitarstringsHasName(){
        assertEquals("Dadario", guitarStrings.getName());
    }

    @Test
    public void guitarstringsHasBuyingPrice(){
        assertEquals(1.0, guitarStrings.getBuyingPrice());
    }

    @Test
    public void guitarstringsHasSellingPrice(){
        assertEquals(5.0, guitarStrings.getSellingPrice());
    }
    @Test
    public void guitarPickHasName(){
        assertEquals("Dunlop", guitarpick.getName());
    }

    @Test
    public void guitarPickHasBuyingPrice(){
        assertEquals(0.05, guitarpick.getBuyingPrice());
    }

    @Test
    public void guitarPickHasSellingPrice(){
        assertEquals(0.25, guitarpick.getSellingPrice());
    }

}

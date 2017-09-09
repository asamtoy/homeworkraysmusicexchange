package com.example.andrewsamtoy.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by andrewsamtoy on 9/9/17.
 */

public class TestInstrument {

    Guitar guitar;
    Piano piano;
    Harp harp;

    @Before
    public void before() {
        guitar = new Guitar("Taylor", 100.0, 200.0);
        piano = new Piano("Steinway", 20000.0, 40000.0);
        harp = new Harp("Horngacher", 5000.0, 10000.0);
    }
    @Test
    public void pianoHasBuyingPrice(){
        assertEquals(20000.0, piano.getBuyingPrice(), .01);
    }

    @Test
    public void harpHasBuyingPrice(){
        assertEquals(5000.0, harp.getBuyingPrice(), .01);
    }

    @Test
    public void harpHasBrand(){
        assertEquals("Horngacher", harp.getBrand());
    }

    @Test
    public void harpHasSellingPrice(){
        assertEquals(10000.0, harp.getSellingPrice());
    }
    @Test
    public void pianoHasSellingPrice(){
        assertEquals(40000.0, piano.getSellingPrice(), .01);
    }

    @Test
    public void guitarHasSellingPrice(){
        assertEquals(200.0, guitar.getSellingPrice(), .01);
    }

    @Test
    public void guitarHasBuyingPrice(){
        assertEquals(100.0, guitar.getBuyingPrice(), .01);
    }

    @Test
    public void guitarCanPlay() {
        assertEquals("Strum", guitar.play());

    }

    @Test
    public void guitarHasBrand(){
        assertEquals("Taylor", guitar.getBrand());
    }

    @Test
    public void pianoHasBrand(){
        assertEquals("Steinway", piano.getBrand());
    }
    @Test
    public void pianoCanPlayChord(){
        assertEquals("Chord", piano.play());
    }

    @Test
    public void harpCanPlay(){
        assertEquals("Heavenly Progression", harp.play());
    }
}

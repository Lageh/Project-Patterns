package com.gui.creation.builder.concrete;

import com.gui.creation.builder.contracts.Builder;

public class Director {
    public void makeProductA (Builder builder) {
        builder.reset();
        builder.setName("Banana");
        builder.setQuantity(9);
    }

    public void makeProductB (Builder builder){
        builder.reset();
        builder.setName("Uva");
        builder.setQuantity(100);
    }

    public Director() {
        System.out.println("Setting up the director");
    }
}

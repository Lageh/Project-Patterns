package com.gui.creation.abstracfactory.factories;

import com.gui.creation.abstracfactory.contracts.Factory;
import com.gui.creation.abstracfactory.products.*;

public class samsung implements Factory {
    final static double MARGIN_ = 0.7;
    @Override
    public Product createIphone13(String name, String description, double cost) {
        return new iPhone_13(name,description,cost,cost * (1 + MARGIN_));
    }

    @Override
    public Product createIphone(String name, String description, double cost) {
        return new iPhone(name,description,cost,cost * (1 + MARGIN_));
    }

    @Override
    public Product createIphone14(String name, String description, double cost) {
        return new iPhone_14(name,description,cost,cost * (1 + MARGIN_));
    }


    public samsung() {
        System.out.println("Creating factory Samsung");
    }
}

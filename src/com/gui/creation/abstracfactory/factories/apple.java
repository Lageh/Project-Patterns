package com.gui.creation.abstracfactory.factories;

import com.gui.creation.abstracfactory.interfaces.Factory;
import com.gui.creation.abstracfactory.products.*;

public class apple implements Factory {
    final static double MARGIN_ = 2;

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


    public apple(){
        System.out.println("Creating factory Apple");
    }
}

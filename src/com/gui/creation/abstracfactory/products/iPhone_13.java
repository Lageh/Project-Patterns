package com.gui.creation.abstracfactory.products;

import com.gui.creation.abstracfactory.contracts.cellphone;

public class iPhone_13 extends Product implements cellphone {

    public String provider;
    public String model;
    public iPhone_13(String name, String description, double cost, double price) {
        this.price = price;
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }
}

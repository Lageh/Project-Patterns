package com.gui.creation.factorymethod;

import com.gui.creation.factorymethod.contracts.ProductA;

public class ProductC1 extends Product implements ProductA {

    @Override
    public void addColor() {
        System.out.println("adding color to product C1");
    }

    @Override
    public void addSize() {
        System.out.println("Adding size to product C1");
    }

    public ProductC1(String name, String description, double cost, double price) {
        this.price = price;
        this.cost = cost;
        this.name = name;
        this.description = description;
    }
}

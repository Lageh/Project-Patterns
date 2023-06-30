package com.gui.creation.factorymethod.products;

import com.gui.creation.factorymethod.contracts.ProductA;

public class ProductA2 extends Product implements ProductA {

    @Override
    public void addColor() {
        System.out.println("adding color to product A2");
    }

    @Override
    public void addSize() {
        System.out.println("Adding size to product A2");
    }

    public ProductA2(String name, String description, double cost, double price) {
        this.price = price;
        this.cost = cost;
        this.name = name;
        this.description = description;
    }
}

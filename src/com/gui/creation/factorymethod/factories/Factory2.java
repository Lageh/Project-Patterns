package com.gui.creation.factorymethod.factories;

import com.gui.creation.factorymethod.contracts.Factory;
import com.gui.creation.factorymethod.products.Product;
import com.gui.creation.factorymethod.products.ProductA2;
import com.gui.creation.factorymethod.products.ProductB2;

public class Factory2 implements Factory {
    final static double MARGIN_ = 0.4;
    @Override
    public Product CreateProductA(String name, String description, double cost) {
        return new ProductA2(name, description, cost, cost * (1 + MARGIN_ + 0.1));
    }

    @Override
    public Product CreateProductB(String name, String description, double cost) {
        return new ProductB2(name, description, cost, cost * (1 + MARGIN_ + 0.2));
    }
    public Product CreateProductC(String name, String description, double cost) {
        return new ProductB2(name, description, cost, cost * (1 + MARGIN_ + 0.3));
    }

    public Product createProduct(char type, String name, String description, double cost) {
        switch (Character.toUpperCase(type)) {
            case 'A' -> {
                return CreateProductA(name, description, cost);
            }
            case 'B' -> {
                return CreateProductB(name, description, cost);
            }
            case 'C' -> {
                return CreateProductC(name, description, cost);
            }
        }
        return null;
    }
    public Factory2() {
        System.out.println("Constructing Factory 2");

    }
}

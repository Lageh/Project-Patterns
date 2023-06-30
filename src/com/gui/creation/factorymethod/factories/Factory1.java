package com.gui.creation.factorymethod.factories;

import com.gui.creation.factorymethod.contracts.Factory;
import com.gui.creation.factorymethod.products.Product;
import com.gui.creation.factorymethod.products.ProductA1;
import com.gui.creation.factorymethod.products.ProductB1;
import com.gui.creation.factorymethod.products.ProductC1;

public class Factory1 implements Factory {
    final static double MARGIN_ = 0.3;
    @Override
    public Product CreateProductA(String name, String description, double cost) {
        return new ProductA1(name, description, cost, cost * (1 + MARGIN_));
    }

    @Override
    public Product CreateProductB(String name, String description, double cost) {
        return new ProductB1(name, description, cost, cost * (1+ MARGIN_));
    }
    public Product CreateProductC(String name, String description, double cost) {
        return new ProductC1(name, description, cost, cost * (1+ MARGIN_));
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

    public Factory1() {
        System.out.println("Constructing Factory 1");
    }
}

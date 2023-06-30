package com.gui.creation.factorymethod.contracts;

import com.gui.creation.factorymethod.Product;

public interface Factory {
    Product CreateProductA(String name, String description, double cost);
    Product CreateProductB(String name, String description, double cost);
    Product CreateProductC(String name, String description, double cost);
}

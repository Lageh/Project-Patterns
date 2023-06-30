package com.gui.creation.abstracfactory.contracts;

import com.gui.creation.abstracfactory.products.Product;

public interface Factory {
    Product createIphone13(String name, String description, double cost);
    Product createIphone(String name, String description, double cost);
    Product createIphone14(String name, String description, double cost);
}

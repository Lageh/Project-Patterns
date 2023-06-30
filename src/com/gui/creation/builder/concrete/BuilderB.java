package com.gui.creation.builder.concrete;

import com.gui.creation.builder.contracts.Builder;
import com.gui.creation.builder.products.Product;
import com.gui.creation.builder.products.ProductB;

public class BuilderB implements Builder {
    private ProductB productB;
    @Override
    public void reset() {
        this.productB = new ProductB();
    }

    @Override
    public void setName(String name) {
        productB.setName(name);
    }

    @Override
    public void setQuantity(int quantity) {
        productB.setQuantity(quantity);
    }


    public Product getProduct(){
        return new ProductB();
    }

    public BuilderB() {
        System.out.println("Setting up Builder 1");
    }
}

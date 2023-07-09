package com.gui.creation.builder.concrete;

import com.gui.creation.builder.interfaces.Builder;
import com.gui.creation.builder.products.Product;
import com.gui.creation.builder.products.ProductA;

public class BuilderA implements Builder {
    private ProductA productA;

    @Override
    public void reset() {
        this.productA = new ProductA();
    }

    @Override
    public void setName(String name) {
        productA.setName(name);
    }

    @Override
    public void setQuantity(int quantity) {
        productA.setQuantity(9);
    }

    public Product getProduct() {
        return this.productA;
    }

    public BuilderA() {
        System.out.println("Setting up builder B");
    }
}

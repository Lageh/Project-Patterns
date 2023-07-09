package com.gui.creation.abstracfactory.products;
import com.gui.creation.abstracfactory.interfaces.cellphone;


public class iPhone extends Product implements cellphone {

    public String provider;
    public String model;
    public iPhone(String name, String description, double cost, double price) {
        this.price = price;
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public void setProvider(String provider) {
        System.out.println("This iPhone version do not suppport provider");
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }
}

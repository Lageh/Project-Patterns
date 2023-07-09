package com.gui.creation.factorymethod.factories;

import com.gui.creation.factorymethod.interfaces.Cellphone;
import com.gui.creation.factorymethod.products.Iphone;

public class Apple implements CellphoneFactory {

    public Cellphone createCellphone() {
        return new Iphone();
    }

}

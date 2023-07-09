package com.gui.creation.factorymethod.factories;

import com.gui.creation.factorymethod.interfaces.Cellphone;
import com.gui.creation.factorymethod.products.Redmi;

public class Xiaomi implements CellphoneFactory{
    @Override
    public Cellphone createCellphone() {
        return new Redmi();
    }

}

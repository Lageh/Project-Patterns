package com.gui.creation.factorymethod.factories;

import com.gui.creation.factorymethod.interfaces.Cellphone;
import com.gui.creation.factorymethod.products.Galaxy;

public class Samsung implements CellphoneFactory{

    public Cellphone createCellphone() {
        return new Galaxy();
    }
}

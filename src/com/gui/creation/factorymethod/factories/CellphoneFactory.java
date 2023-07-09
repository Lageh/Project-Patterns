package com.gui.creation.factorymethod.factories;

import com.gui.creation.factorymethod.interfaces.Cellphone;

public interface CellphoneFactory {
    abstract Cellphone createCellphone();

    default void makeCall(){
        System.out.println("making a call...");
    }

    default void takePicture(){
        System.out.println("trying to take a picture...");
    }
}

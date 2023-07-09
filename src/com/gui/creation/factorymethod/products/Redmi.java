package com.gui.creation.factorymethod.products;
import com.gui.creation.factorymethod.interfaces.Cellphone;

public class Redmi implements Cellphone {

    @Override
    public void makeCall() {
        System.out.println("Redmi: Ringing........");
    }

    @Override
    public void takePicture() {
        System.out.println("Redmi: Taking a picture........");

    }

    @Override
    public void playMusic() {
        System.out.println("Redmi: Playing........");
    }
}

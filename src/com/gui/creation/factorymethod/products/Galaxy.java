package com.gui.creation.factorymethod.products;
import com.gui.creation.factorymethod.interfaces.Cellphone;

public class Galaxy implements Cellphone {

    @Override
    public void makeCall() {
        System.out.println("Galaxy: Ringing........");
    }

    @Override
    public void takePicture() {
        System.out.println("Galaxy: Taking a picture........");

    }

    @Override
    public void playMusic() {
        System.out.println("Galaxy: Playing........");
    }
}

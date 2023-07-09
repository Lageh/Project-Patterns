package com.gui.creation.factorymethod.products;
import com.gui.creation.factorymethod.interfaces.Cellphone;

public class Iphone implements Cellphone {

    @Override
    public void makeCall() {
        System.out.println("Iphone: Ringing........");
    }

    @Override
    public void takePicture() {
        System.out.println("Iphone: Taking a picture........");

    }

    @Override
    public void playMusic() {
        System.out.println("Iphone: Playing........");
    }
}

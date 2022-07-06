package com.Tema456.ejercicio1;

public class SmartPhone extends SmartDevice{

    private boolean camera;
    private float screenPixels;
    private String screenResolution;
    public SmartPhone() {
    }

    public SmartPhone(String name, String model, String branch, String SO, double price, double weight, boolean camera, float screenPixels, String screenResolution) {
        super(name, model, branch, SO, price, weight);
        this.camera = camera;
        this.screenPixels = screenPixels;
        this.screenResolution = screenResolution;
    }

    public boolean getCamera() {
        return camera;
    }

    public float getScreenPixels() {
        return screenPixels;
    }

    public String getScreenResolution() {
        return screenResolution;
    }
}

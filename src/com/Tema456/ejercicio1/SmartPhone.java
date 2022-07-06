package com.Tema456.ejercicio1;

public class SmartPhone extends SmartDevice{

    private boolean camera;
    private float screenPixels;
    private String screenResolution;

    public SmartPhone() {
    }

    public SmartPhone(String name, String model, String branch, double price, double weight, boolean camera, float screenPixesl, String screenResolution) {
        super(name, model, branch, price, weight);
        this.camera = camera;
        this.screenPixels = screenPixesl;
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

package com.Tema456.ejercicio1;

public class SmartWatch extends SmartDevice{

    private String dateZone;

    private String type;

    public SmartWatch() {
    }

    public SmartWatch(String name, String model, String branch, double price, double weight, String dateZone, String type) {
        super(name, model, branch, price, weight);
        this.dateZone = dateZone;
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public String getDateZone() {
        return dateZone;
    }

}

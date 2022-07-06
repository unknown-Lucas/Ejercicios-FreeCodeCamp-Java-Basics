package com.Tema456.ejercicio1;

public abstract class SmartDevice {
    private double weight;
    private String name;
    private String model;
    private String  branch;
    private double price;

    public SmartDevice(){
    }

    public SmartDevice(String name, String model, String branch,double price,double weight){
        this.weight = weight;
        this.price = price;
        this.branch = branch;
        this.model = model;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public String getBranch() {
        return branch;
    }

    public double getPrice() {
        return price;
    }
}

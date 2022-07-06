package com.Tema456.ejercicio2;

public class Car {

    int id;
    String model;
    String branch;
    Double price;

    public Car(int id,String model, String branch, Double price) {
        this.id = id;
        this.model = model;
        this.branch = branch;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", branch='" + branch + '\'' +
                ", price=" + price +
                '}';
    }
}

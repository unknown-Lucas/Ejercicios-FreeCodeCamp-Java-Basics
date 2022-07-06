package com.Tema456.ejercicio2;

public class Main {

    public static void main(String[] args) {
        CocheCrud cocheCrud = new CocheCrudimpl();
        Car car1 = new Car(1,"A9","Audi", 9000.0);
        Car car2 = new Car(2,"benz", "Mercedes", 5500.0);
        Car car3 = new Car(3,"sandero", "Hyunday", 30032.021);
        cocheCrud.save(car1);
        System.out.println(cocheCrud.findAll());
        cocheCrud.save(car2);
        System.out.println(cocheCrud.findAll());
        cocheCrud.delete(car2);
        System.out.println(cocheCrud.findAll());
        cocheCrud.save(car3);
        System.out.println(cocheCrud.findAll());
    }

}

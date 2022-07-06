package com.Tema456.ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        SmartPhone Phone = new SmartPhone("Telefono de lucas","Galaxy ace","Samsung",220.5,312,true,500,"full HD");
        SmartWatch Watch = new SmartWatch("Reloj de lucas","Android smart wathc","Google",200.45,300,"Madrid-UTM","circle");
        System.out.println("Telefono");
        System.out.println("---------------------");
        System.out.println(Phone.getName());
        System.out.println(Phone.getModel());
        System.out.println(Phone.getBranch());
        System.out.println(Phone.getPrice() + " euros");
        System.out.println(Phone.getWeight() + " g");
        System.out.println(Phone.getCamera() ? "Disponible" : "No disponible");
        System.out.println(Phone.getScreenPixels() + "px");
        System.out.println(Phone.getScreenResolution());
        System.out.println("---------------------");
        System.out.println("Reloj");
        System.out.println("---------------------");
        System.out.println(Watch.getName());
        System.out.println(Watch.getModel());
        System.out.println(Watch.getBranch());
        System.out.println(Watch.getPrice() + " euros");
        System.out.println(Watch.getDateZone());
        System.out.println("tipo " +  Watch.getType());

        System.out.println("---------------------");
    }
}

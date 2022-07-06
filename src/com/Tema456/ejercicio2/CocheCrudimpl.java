package com.Tema456.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class CocheCrudimpl implements CocheCrud{

    List<Car> carList = new ArrayList<>();;

    public CocheCrudimpl() {}

    @Override
    public void save(Car carObject) {
        carList.add(carObject);
    }

    @Override
    public String findAll() {
        return carList.toString();
    }

    @Override
    public void delete(Car car) {
        carList.remove(car);
    }
}

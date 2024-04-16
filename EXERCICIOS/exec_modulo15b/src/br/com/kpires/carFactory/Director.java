package br.com.kpires.carFactory;

import br.com.kpires.carFactory.Factories.CarFactory;

public class Director {
    CarFactory carFactory;

    public void setCarFactory(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public Car createCar() {
        return carFactory.createCar();
    }
}

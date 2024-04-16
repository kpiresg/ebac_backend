package br.com.kpires.carFactory.Factories;

import br.com.kpires.carFactory.Car;
import br.com.kpires.carFactory.FuelCars.Chevrolet;
import br.com.kpires.carFactory.FuelCars.Hb20;
import br.com.kpires.carFactory.SelectCar;

public class FuelCarFactory extends CarFactory{
    SelectCar selectCar = new SelectCar();


    @Override
    public Car createCar() {
        selectCar.selectCar();

        if (selectCar.getCar().equals("1")) {
            Hb20 hb20 = new Hb20();
            hb20.showFuel();

            return new Car(hb20.getVelocity(), hb20.getColor(), hb20.getMarca());

        } else if (selectCar.getCar().equals("2")) {
            Chevrolet chevrolet = new Chevrolet();
            chevrolet.showFuel();

            return new Car(chevrolet.getVelocity(), chevrolet.getColor(), chevrolet.getMarca());

        } else {
            return null;
        }
    }
}

package br.com.kpires.carFactory.Factories;

import br.com.kpires.carFactory.Car;
import br.com.kpires.carFactory.EletricCars.Porsche;
import br.com.kpires.carFactory.EletricCars.Tesla;
import br.com.kpires.carFactory.SelectCar;

public class EletricCarFactory extends CarFactory{

    SelectCar selectCar = new SelectCar();

    @Override
    public Car createCar() {
        selectCar.selectCar();

        if(selectCar.getCar().equals("1")) {
            Tesla tesla = new Tesla();
            tesla.showPower();

            return new Car(tesla.getVelocity(), tesla.getCor(), tesla.getMarca());
        } else {
            Porsche porsche = new Porsche();
            porsche.showPower();

            return new Car(porsche.getVelocity(), porsche.getCor(), porsche.getMarca());
        }
    }
}

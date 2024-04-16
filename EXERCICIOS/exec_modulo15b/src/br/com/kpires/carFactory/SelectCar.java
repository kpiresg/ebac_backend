package br.com.kpires.carFactory;

import br.com.kpires.carFactory.Factories.CarFactory;
import br.com.kpires.carFactory.Factories.EletricCarFactory;
import br.com.kpires.carFactory.Factories.FuelCarFactory;

import java.util.Scanner;

public class SelectCar {
    static String typeCar;
    public CarFactory carType;
    public String car;

    public CarFactory getCarType() {
        return carType;
    }

    public String getCar() {
        return car;
    }

    public void selectTypeCar() {
        System.out.println("Escolha o tipo de carro\n" +
                "1 - Eletrico\n" +
                "2 - Gasolina\n" +
                "Digite o numero de acordo com o carro:");

        Scanner scan1 = new Scanner(System.in);

        typeCar = scan1.nextLine();

        if (typeCar.equals("2")) {
            carType = new FuelCarFactory();

        } else {
            carType = new EletricCarFactory();

        }
    }

    public void selectCar() {
        Scanner scan2 = new Scanner(System.in);

        if(typeCar.equals("2")) {
            System.out.println("Escolha o carro\n" +
                    "1 - Hb20\n" +
                    "2 - Chevrolet\n" +
                    "Digite o numero de acordo com o carro:");

            String car = scan2.nextLine();
            this.car = car;

        } else {
            System.out.println("Escolha o carro\n" +
                    "1 - Tesla\n" +
                    "2 - Porsche\n" +
                    "Digite o numero de acordo com o carro:");

            String car = scan2.nextLine();
            this.car = car;
        }
        scan2.close();
    }
}

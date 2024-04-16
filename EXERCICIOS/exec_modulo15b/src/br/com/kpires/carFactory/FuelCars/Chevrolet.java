package br.com.kpires.carFactory.FuelCars;

import br.com.kpires.carFactory.Factories.FuelCarFactory;

public class Chevrolet extends FuelCarFactory {
    String velocity = "175km/h";
    String color = "Amarelo";
    String marca = "Chevrolet";
    String gasolina = "Cheio";

    public String getVelocity() {
        return velocity;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getGasolina() {
        return gasolina;
    }

    @Override
    public String toString() {
        return "Chevrolet{" +
                "gasolina='" + gasolina + '\'' +
                '}';
    }
    public void showFuel() {
        System.out.println(toString());
    }
}

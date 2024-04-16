package br.com.kpires.carFactory.FuelCars;

public class Hb20{
    String velocity = "180km/h";
    String color = "branco";
    String marca = "Hb20";
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
        return "Hb20{" +
                "gasolina='" + gasolina + '\'' +
                '}';
    }
    public void showFuel() {
        System.out.println(toString());
    }
}

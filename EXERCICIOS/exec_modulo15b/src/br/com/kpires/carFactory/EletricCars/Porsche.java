package br.com.kpires.carFactory.EletricCars;

public class Porsche {

    String velocity = "315km/h";
    String cor = "Cinza";
    String marca = "Porsche";
    String bateria = "100%";

    public String getVelocity() {
        return velocity;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getBateria() {
        return bateria;
    }

    @Override
    public String toString() {
        return "Porsche{" +
                "bateria='" + bateria + '\'' +
                '}';
    }

    public void showPower() {
        System.out.println(toString());
    }
}

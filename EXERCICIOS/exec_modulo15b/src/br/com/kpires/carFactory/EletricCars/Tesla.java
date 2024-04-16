package br.com.kpires.carFactory.EletricCars;

public class Tesla {

    String velocity = "261km/h";
    String cor = "Branco";
    String marca = "Tesla";
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
        return "Tesla{" +
                "bateria='" + bateria + '\'' +
                '}';
    }

    public void showPower() {
        System.out.println(toString());
    }
}

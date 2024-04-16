package br.com.kpires.carFactory;

public class Car {
    String velocidade;
    String cor;
    String marca;

    public Car(String velocidade, String cor, String marca) {

        this.velocidade = velocidade;
        this.cor = cor;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Car{" +
                "velocidade='" + velocidade + '\'' +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

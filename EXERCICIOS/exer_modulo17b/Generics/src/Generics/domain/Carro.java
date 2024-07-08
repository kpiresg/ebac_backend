package Generics.domain;

public abstract class Carro {

    public Carro(String nome, String modelo, String ano) {

        this.nome = nome;
        this.modelo = modelo;
        this.ano = Integer.parseInt(ano);
    }

    String nome;
    String modelo;
    int ano;


    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}

package br.com.kpires.interfaces;

public interface ICaneta {

    public void escrever(String texto);

    public String getCor();

    default void printAll(String texto) {
        System.out.println(texto);
    }
}

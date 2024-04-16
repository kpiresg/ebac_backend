package br.com.kpires.interfaces;

public class CanetaEsf implements ICaneta {
    @Override
    public void escrever(String texto) {
        System.out.println("Você escreveu: " + texto);
    }

    @Override
    public String getCor() {
        return "Azul";
    }
}

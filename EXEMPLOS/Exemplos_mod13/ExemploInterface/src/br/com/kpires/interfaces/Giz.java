package br.com.kpires.interfaces;

public class Giz implements ICaneta{
    @Override
    public void escrever(String texto) {
        System.out.println("Você escreveu: ");
    }

    @Override
    public String getCor() {
        return "Branco";
    }
}

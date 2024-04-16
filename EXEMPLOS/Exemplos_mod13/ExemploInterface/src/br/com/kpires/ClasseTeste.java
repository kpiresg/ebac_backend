package br.com.kpires;

import br.com.kpires.interfaces.CanetaEsf;
import br.com.kpires.interfaces.Giz;
import br.com.kpires.interfaces.ICaneta;
import br.com.kpires.interfaces.Lapis;

public class ClasseTeste {

    public static void main(String args[]) {
        ICaneta caneta = new CanetaEsf();
        ICaneta lapis = new Lapis();
        ICaneta giz = new Giz();

        caneta.escrever("Caneta aqui");
        System.out.println("Cor da caneta: " + caneta.getCor());

        lapis.escrever("Lapis aqui");
        System.out.println("Cor do lapis" + lapis.getCor());

        giz.escrever("Giz aqui");
        System.out.println("Cor do giz: " + giz.getCor());

        caneta.printAll("Olá mundo!");
    }
}

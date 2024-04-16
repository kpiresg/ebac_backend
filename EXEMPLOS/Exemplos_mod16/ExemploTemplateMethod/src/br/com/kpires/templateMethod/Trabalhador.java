package br.com.kpires.templateMethod;

public abstract class Trabalhador {

    public void executar() {
        levantar();
        arrumar();
        saindo();
        trabalhando();
        voltando();
    }

    protected void levantar() {
        System.out.println("Levantando");
    }

    protected void arrumar() {
        System.out.println("Se arrumando");
    }

    protected void saindo() {
        System.out.println("Saindo de casa");
    }

    abstract void trabalhando();

    protected void voltando() {
        System.out.println("voltando para casa");
    }
}

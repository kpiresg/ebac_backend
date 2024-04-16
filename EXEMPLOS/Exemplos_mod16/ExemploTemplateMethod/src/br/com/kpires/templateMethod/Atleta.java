package br.com.kpires.templateMethod;

public class Atleta extends Trabalhador{

    public String nome;
    public int idade;
    public float peso;


    @Override
    void trabalhando() {
        System.out.println("Treinando");
    }

    @Override
    protected void arrumar() {
        System.out.println("Alongando...");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                '}';
    }
}
